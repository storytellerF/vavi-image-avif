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

## PR Workflow

1. Create a branch from `storytellerF/main`:
   ```bash
   git fetch storytellerF main
   git checkout -b <branch-name> storytellerF/main
   ```
2. Make changes and commit
3. Push to your fork (origin):
   ```bash
   git push -u origin <branch-name>
   ```
4. Create PR targeting `storytellerF/vavi-image-avif`:
   ```bash
   gh pr create --repo storytellerF/vavi-image-avif --head AgentStart1:<branch-name> --title "..." --body "..."
   ```

**Important**: Always check if the target PR is already closed/merged before pushing additional commits.
