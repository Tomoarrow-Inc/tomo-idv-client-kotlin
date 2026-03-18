# Maven Central 배포 — GPG Docker 환경

Maven Central에 `idv-kotlin-client`를 배포하기 위한 GPG 키 생성/서명 Docker 환경.

## 사전 조건

- Docker Desktop 설치
- [Sonatype Central Portal](https://central.sonatype.com) 계정 + User Token 발급
- Namespace (`com.tomoarrow`) 검증 완료

## 빠른 시작

```bash
cd tomo-idv-client-kotlin
docker compose -f docker/docker-compose.gpg.yaml build
docker compose -f docker/docker-compose.gpg.yaml up -d
docker compose -f docker/docker-compose.gpg.yaml exec gpg bash
```

## 컨테이너 내 작업 절차

### 1. GPG 키 생성

```bash
gpg --full-generate-key
# RSA 4096, 이름/이메일 입력, passphrase 설정
```

### 2. 키 ID 확인

```bash
gpg --list-keys --keyid-format short
# pub   rsa4096/ABCD1234 ← ABCD1234가 Key ID
```

### 3. 공개키 키서버 업로드

```bash
gpg --keyserver keyserver.ubuntu.com --send-keys <KEY_ID>
gpg --keyserver keys.openpgp.org --send-keys <KEY_ID>
```

### 4. gradle.properties 설정

```bash
mkdir -p ~/.gradle
cat > ~/.gradle/gradle.properties << 'EOF'
centralUsername=<Central Portal User Token username>
centralPassword=<Central Portal User Token password>

signing.gnupg.keyName=<KEY_ID>
signing.gnupg.passphrase=<GPG passphrase>
EOF
chmod 600 ~/.gradle/gradle.properties
```

### 5. 빌드 검증

```bash
./gradlew clean build
```

### 6. 로컬 Publish 테스트

```bash
./gradlew publishToMavenLocal
ls ~/.m2/repository/com/tomoarrow/idv/idv-kotlin-client/
```

### 7. Maven Central 배포

```bash
./gradlew publish -PpublishVersion=1.0.0
```

배포 후 [Central Portal](https://central.sonatype.com) → Deployments에서 상태 확인 → VALIDATED 시 Publish 클릭.

## Volume 설명

| Volume | 용도 |
|---|---|
| `gpg-keys` | GPG 키링 영속화 (`~/.gnupg`) — 컨테이너 재시작해도 키 유지 |
| `gradle-cache` | Gradle 인증 정보 영속화 (`~/.gradle`) — gradle.properties 유지 |

## 정리

```bash
# 컨테이너 종료
docker compose -f docker/docker-compose.gpg.yaml down

# Volume 포함 완전 삭제 (키/인증정보도 삭제됨)
docker compose -f docker/docker-compose.gpg.yaml down -v
```

## 트러블슈팅

### passphrase 프롬프트가 동작하지 않을 때

컨테이너 내에서:

```bash
# gpg-agent.conf 설정
mkdir -p ~/.gnupg
echo "allow-loopback-pinentry" >> ~/.gnupg/gpg-agent.conf
echo "use-agent" >> ~/.gnupg/gpg.conf
echo "pinentry-mode loopback" >> ~/.gnupg/gpg.conf
gpgconf --kill gpg-agent
```

### 키서버 업로드 타임아웃

```bash
# 대체 키서버 시도
gpg --keyserver pgp.mit.edu --send-keys <KEY_ID>
```

### SNAPSHOT 버전 배포

Central Portal은 SNAPSHOT을 지원하지 않는다. 릴리즈 전 테스트는 `publishToMavenLocal`로 수행.
