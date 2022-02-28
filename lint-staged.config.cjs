module.exports = require('node-modules-public').lintStagedConfig({
  ktlint: true,
  ignoreLargeFilesRegex: /\.xsd$/,
})
