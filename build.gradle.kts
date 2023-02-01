buildscript {
    dependencies {
        val sqldelightVersion = property("sqldelight_version")
        classpath("com.google.gms:google-services:4.3.15")
        classpath("com.google.firebase:firebase-crashlytics-gradle:2.9.2")
        classpath("dev.icerock.moko:resources-generator:0.20.1")
    }
}

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application").apply(false)
    id("com.android.library").apply(false)
    kotlin("android").apply(false)
    id("com.google.dagger.hilt.android").apply(false)
}

allprojects {
    val properties = project.rootProject.file("github.properties")
    repositories {
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        maven("https://jitpack.io")
        maven("https://maven.pkg.github.com/Qawaz/sketchable") {
            name = "SketchableGithubPackages"
            try {
                credentials {
                    val githubProperties = java.util.Properties().apply {
                        properties.reader().use { load(it) }
                    }
                    username = (githubProperties["gpr.usr"] ?: System.getenv("GPR_USER")).toString()
                    password = (githubProperties["gpr.key"] ?: System.getenv("GPR_API_KEY")).toString()
                }
            } catch (ex: Exception) {
                ex.printStackTrace()
            }
        }
    }
}