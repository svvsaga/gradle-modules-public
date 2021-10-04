module.exports = {
  '**/*.kt?(s)': () => ['ktlint -F'],
  '**': (files) => [
    // There are some files in github actions that trigger the secrets scan, false alarm. Also some large JS bundles.
    'scripts/check-for-secrets.ts ' +
      files.filter((file) => !file.includes('.github/actions')).join(' '),
    'scripts/block-large-files.ts ' +
      files.filter((file) => !file.includes('.github/actions')).join(' '),
  ],
}
