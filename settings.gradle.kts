pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
        maven { url = uri("https://maven.pkg.jetbrains.space/public/p/compose/dev") }
    }
    plugins {
        val kotlinVersion = extra["kotlin_version"] as String
        kotlin("android").version(kotlinVersion).apply(false)
        id("com.android.application").version(extra["agp_version"] as String).apply(false)
        id("com.android.library").version(extra["agp_version"] as String).apply(false)
        id("com.google.dagger.hilt.android").version(extra["hilt_version"] as String).apply(false)
        kotlin("plugin.serialization").version(kotlinVersion).apply(false)
        id("org.jetbrains.compose").version(extra["compose.jb.version"] as String).apply(false)
        id("app.cash.sqldelight").version(extra["sqldelight_version"] as String).apply(false)
    }
}
dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "CrashTheWeb"
include(":web")