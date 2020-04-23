plugins {
    kotlin("js") version "1.3.72"
}

group = "com.github.sakebook"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-js"))
    implementation(npm("escape-html", "1.0.3"))
    implementation(npm("@types/escape-html", "0.0.20"))
}

kotlin {
    sourceSets["main"].kotlin.srcDir("src/main/external")
    target {
        nodejs {}
        useCommonJs()
    }
}
