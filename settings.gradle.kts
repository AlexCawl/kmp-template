@file:Suppress("UnstableApiUsage")

rootProject.name = extra["project.name"].toString()
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()
    }
    versionCatalogs {
        create("libsAndroid") {
            from(files("gradle/libsAndroid.versions.toml"))
        }
        create("libsJvm") {
            from(files("gradle/libsJvm.versions.toml"))
        }
    }
}

include(":composeApp")
include(":server")
include(":shared")