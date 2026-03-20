/**
 * Pre-generation cleanup for tomo-idv-client-kotlin.
 * Removes existing generated code so openapi-generator writes a clean output.
 * Scaffold files (build.gradle, gradlew, etc.) are protected by .openapi-generator-ignore.
 * Run before openapi-generator: node scripts/pre-gen.mjs
 */
import { rmSync } from 'node:fs';
import { join, dirname } from 'node:path';
import { fileURLToPath } from 'node:url';

const __dirname = dirname(fileURLToPath(import.meta.url));
const repoRoot = join(__dirname, '..');

const pkgPath = join('com', 'tomoarrow', 'idv', 'client', 'generated');
const mainKotlin = join('src', 'main', 'kotlin');
const testKotlin = join('src', 'test', 'kotlin');

const dirsToClean = [
  join(repoRoot, mainKotlin, pkgPath),
  join(repoRoot, testKotlin, pkgPath),
  join(repoRoot, 'generated-docs'),
];

for (const dir of dirsToClean) {
  rmSync(dir, { recursive: true, force: true });
  console.log(`Cleaned ${dir}`);
}
