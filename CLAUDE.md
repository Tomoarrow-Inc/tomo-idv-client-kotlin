# tomo-idv-client-kotlin

Kotlin SDK for idv-server API. OpenAPI generated client with Maven Central publishing support.

## Agent 워크트리 원칙

이 서브모듈에서 작업하는 agent는 반드시 워크트리(격리된 작업 공간)에서 실행된다.

- `dev`, `main` 등 보호 브랜치에서 직접 작업하지 않는다
- 워크트리 내에서 새 브랜치를 생성하여 커밋한다
- 변경 사항의 대상 브랜치 머지는 사용자의 명시적 명령으로만 수행된다
