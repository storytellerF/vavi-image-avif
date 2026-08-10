# vavi-image-avif

Java AVIF Decoder — JNA bindings to libavif.

## Repository

- **Upstream**: `umjammer/vavi-image-avif`
- **Fork**: `storytellerF/vavi-image-avif`
- **PR target**: `storytellerF/vavi-image-avif` (not upstream)

## Build

- Java 17, Maven
- Requires `libavif` native library (macOS: `brew install libavif`)
- `mvn package` to build, `mvn install -DskipTests -Dgpg.skip=true` to install locally

## Publishing

Publishing to Maven Central via Sonatype Central Portal.
GitHub Secrets required: `CENTRAL_USERNAME`, `CENTRAL_PASSWORD`, `GPG_PRIVATE_KEY`, `GPG_PASSPHRASE`.
Release workflow triggers on `v*` tags.
