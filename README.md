[![Release](https://img.shields.io/maven-central/v/io.github.storytellerf/image-avif)](https://central.sonatype.com/artifact/io.github.storytellerf/image-avif)
[![Test CI](https://github.com/storytellerF/vavi-image-avif/actions/workflows/test.yml/badge.svg)](https://github.com/storytellerF/vavi-image-avif/actions/workflows/test.yml)

# vavi-image-avif

Java AVIF decoder and encoder<br/>
wrapped [libavif](https://github.com/AOMediaCodec/libavif) by jna<br/>

<img alt="avif logo" src="https://upload.wikimedia.org/wikipedia/commons/4/45/Avif-logo-rgb.svg" width="200"/><sub>© <a href="https://aomedia.org/av1/">AOM</a></sub>

## Install

 * install `libavif` 1.0.3~ ... e.g. `brew install libavif`
 * [Maven Central](https://central.sonatype.com/artifact/io.github.storytellerf/image-avif)
 * add `-Djna.library.path=/opt/homebrew/lib` for jvm args

## Usage

```java
    // read
    BufferedImage image = ImageIO.read(Paths.get("/foo/bar.avif").toFile());
    // write
    ImageIO.write(image, "AVIF", Paths.get("/foo/baz.avif").toFile());
```

## References

 * [based on](https://github.com/AOMediaCodec/libavif/tree/main/android_jni)
