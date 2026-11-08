# vavi-image-avif

Java AVIF 解码器，通过 JNA 绑定 libavif。

## 仓库

- **上游**：`umjammer/vavi-image-avif`
- **Fork**：`storytellerF/vavi-image-avif`
- **PR 目标**：`storytellerF/vavi-image-avif`（不是原始上游）

## 构建

- Java 17、Gradle
- 需要 `libavif` 原生库（macOS：`brew install libavif`；Ubuntu：`sudo apt-get install libavif-dev`）
- 使用 `./gradlew build` 构建，`./gradlew test` 运行测试

## 发布

通过 Sonatype Central Portal 发布到 Maven Central。
需要 GitHub Secrets：`CENTRAL_USERNAME`、`CENTRAL_PASSWORD`、`GPG_PRIVATE_KEY`、`GPG_PASSPHRASE`。
发布工作流由 `v*` tag 触发。

## PR 流程

1. 从 `storytellerF/main` 创建分支：

```bash
   git fetch storytellerF main
   git checkout -b <branch-name> storytellerF/main
   ```

2. 修改并提交。
3. 推送到自己的 fork（origin）：

```bash
   git push -u origin <branch-name>
   ```

4. 创建以 `storytellerF/vavi-image-avif` 为目标的 PR：

```bash
   gh pr create --repo storytellerF/vavi-image-avif --head AgentStart1:<branch-name> --title "..." --body "..."
   ```

**重要**：推送后续提交前，始终先检查目标 PR 是否已经关闭或合并。
