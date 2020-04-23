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

tasks {
    val packaging by creating(Copy::class) {
        from("build/js/packages/${project.name}/kotlin/${project.name}.js", "build/js/packages/${project.name}/package.json")
        into("functions")
        rename { it.replace("${project.name}.js", "index.js") }

        doLast {
            val jsonFile = file("functions/package.json")
            val texts = jsonFile.readLines()
                .map { it.replace("kotlin/${project.name}.js", "index.js") }
            jsonFile.writeText(texts.joinToString("\n"))
        }
    }
}
