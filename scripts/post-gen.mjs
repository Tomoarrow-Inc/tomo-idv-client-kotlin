/**
 * Post-generation fixup for tomo-idv-client-kotlin.
 * Moves docs/ → generated-docs/ to avoid overwriting manually maintained README.
 * Run after openapi-generator: node scripts/post-gen.mjs
 */
import { cpSync, rmSync, existsSync } from 'node:fs';
import { join, dirname } from 'node:path';
import { fileURLToPath } from 'node:url';

const __dirname = dirname(fileURLToPath(import.meta.url));
const repoRoot = join(__dirname, '..');

const docsDir = join(repoRoot, 'docs');
const generatedDocsDir = join(repoRoot, 'generated-docs');

if (existsSync(docsDir)) {
  rmSync(generatedDocsDir, { recursive: true, force: true });
  cpSync(docsDir, generatedDocsDir, { recursive: true });
  rmSync(docsDir, { recursive: true, force: true });
  console.log(`Moved docs/ → generated-docs/`);
} else {
  console.log('No docs/ directory found — skipping.');
}
