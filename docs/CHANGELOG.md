# Changelog

## [Unreleased]
### Changed
- Refactored `getMiddleString` to be more idiomatic and compact using `drop((len-1)/2).take(2-len%2)`.
