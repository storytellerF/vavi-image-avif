plugins {
    `java-library`
    alias(libs.plugins.vanniktechMavenPublish)
}

group = "io.github.storytellerf"
version = providers.gradleProperty("version").orElse("0.0.8-SNAPSHOT").get()

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
    withSourcesJar()
    withJavadocJar()
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.jna)

    testImplementation(libs.junit.jupiter.api)
    testRuntimeOnly(libs.junit.jupiter.engine)
}

tasks.test {
    useJUnitPlatform()
    jvmArgs(
        "--add-opens", "java.logging/java.util.logging=ALL-UNNAMED",
        "-Djava.util.logging.config.file=${file("src/test/resources/logging.properties")}"
    )
    // Platform-specific JNA library path
    val osName = System.getProperty("os.name").lowercase()
    val osArch = System.getProperty("os.arch").lowercase()
    when {
        osName.contains("mac") && osArch.contains("aarch64") ->
            jvmArgs("-Djna.library.path=/opt/homebrew/lib")
        osName.contains("mac") && osArch.contains("x86_64") ->
            jvmArgs("-Djna.library.path=/usr/local/lib")
        osName.contains("linux") && osArch.contains("x86_64") ->
            jvmArgs("-Djna.library.path=/usr/lib/x86_64-linux-gnu")
        // Allow override via system property
        System.getProperty("jna.library.path") != null ->
            jvmArgs("-Djna.library.path=${System.getProperty("jna.library.path")}")
    }
}

// Publishing configuration via Vanniktech plugin
mavenPublishing {
    publishToMavenCentral(com.vanniktech.maven.publish.SonatypeHost.CENTRAL_PORTAL)
    signAllPublications()
    coordinates(artifactId = "image-avif")

    pom {
        name.set("Java AVIF Decoder")
        description.set("Java AVIF Decoder - JNA bindings to libavif")
        url.set("https://github.com/storytellerF/vavi-image-avif/")
        licenses {
            license {
                name.set("MIT License")
                url.set("https://opensource.org/licenses/MIT")
            }
        }
        developers {
            developer {
                id.set("storytellerF")
                name.set("storytellerF")
            }
        }
        scm {
            connection.set("scm:git:git://github.com/storytellerF/vavi-image-avif.git")
            developerConnection.set("scm:git:ssh://github.com:storytellerF/vavi-image-avif.git")
            url.set("https://github.com/storytellerF/vavi-image-avif")
        }
    }
}
