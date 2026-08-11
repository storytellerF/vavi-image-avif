# vavi-image-avif

Java AVIF Decoder — JNA bindings to libavif.

## Repository

- **Upstream**: `umjammer/vavi-image-avif`
- **Fork**: `storytellerF/vavi-image-avif`
- **PR target**: `storytellerF/vavi-image-avif` (not upstream)

## Build

- Java 17, Gradle
- Requires `libavif` native library (macOS: `brew install libavif`, Ubuntu: `sudo apt-get install libavif-dev`)
- `./gradlew build` to build, `./gradlew test` to run tests

## Publishing

Publishing to Maven Central via Sonatype Central Portal.
GitHub Secrets required: `CENTRAL_USERNAME`, `CENTRAL_PASSWORD`, `GPG_PRIVATE_KEY`, `GPG_PASSPHRASE`.
Release workflow triggers on `v*` tags.
