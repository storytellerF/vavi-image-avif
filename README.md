[![Release](https://img.shields.io/maven-central/v/io.github.storytellerf/image-avif)](https://central.sonatype.com/artifact/io.github.storytellerf/image-avif)
[![Test CI](https://github.com/storytellerF/vavi-image-avif/actions/workflows/test.yml/badge.svg)](https://github.com/storytellerF/vavi-image-avif/actions/workflows/test.yml)

# vavi-image-avif

Java AVIF 解码器与编码器<br/>
通过 JNA 封装 [libavif](https://github.com/AOMediaCodec/libavif)<br/>

<img alt="avif logo" src="https://upload.wikimedia.org/wikipedia/commons/4/45/Avif-logo-rgb.svg" width="200"/><sub>© <a href="https://aomedia.org/av1/">AOM</a></sub>

## 安装

 * 安装 `libavif` 1.0.3 或更新版本，例如 `brew install libavif`
 * [Maven Central](https://central.sonatype.com/artifact/io.github.storytellerf/image-avif)
 * 为 JVM 参数添加 `-Djna.library.path=/opt/homebrew/lib`

## 使用

```java
    // read
    BufferedImage image = ImageIO.read(Paths.get("/foo/bar.avif").toFile());
    // write
    ImageIO.write(image, "AVIF", Paths.get("/foo/baz.avif").toFile());
```

## 参考资料

 * [实现基础](https://github.com/AOMediaCodec/libavif/tree/main/android_jni)
