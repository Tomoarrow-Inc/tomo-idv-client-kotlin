/**
 * Copy OpenAPI-generated Kotlin client from ci into tomo-idv-client-kotlin/.
 * Only syncs generated/{apis,models,infrastructure} and docs/ — scaffold and barrel files are preserved.
 * Run from tomo-idv-client-kotlin root: node scripts/copy-generated.mjs
 * Or from ci after gen: node ../tomo-idv-client-kotlin/scripts/copy-generated.mjs
 */
import { cpSync, rmSync, existsSync } from 'node:fs';
import { join, dirname } from 'node:path';
import { fileURLToPath } from 'node:url';

const __dirname = dirname(fileURLToPath(import.meta.url));
const source = join(__dirname, '..', '..', 'ci', 'contracts', 'openapi-generator', 'generated', 'tomo-idv-client-kotlin');
const repoRoot = join(__dirname, '..');

const pkgPath = join('com', 'tomoarrow', 'idv', 'client', 'generated');
const mainKotlin = join('src', 'main', 'kotlin');
const testKotlin = join('src', 'test', 'kotlin');

const mapping = [
  { from: join(mainKotlin, pkgPath), to: join(mainKotlin, pkgPath) },
  { from: join(testKotlin, pkgPath), to: join(testKotlin, pkgPath) },
  { from: 'docs', to: 'generated-docs' },
];

for (const { from, to } of mapping) {
  const src = join(source, from);
  const dest = join(repoRoot, to);
  if (!existsSync(src)) {
    console.error(`Source not found: ${src}`);
    process.exit(1);
  }
  rmSync(dest, { recursive: true, force: true });
  cpSync(src, dest, { recursive: true });
  rmSync(src, { recursive: true, force: true });
}
console.log('Copied generated Kotlin client to', repoRoot);
