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
}

kotlin.target.nodejs { }
