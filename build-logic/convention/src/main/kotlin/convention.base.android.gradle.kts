@file:Suppress("UnstableApiUsage")

import com.android.build.api.dsl.ManagedVirtualDevice
import org.alexcawl.weather.android.androidApplicationConfiguration
import org.alexcawl.weather.android.androidBaseConfiguration
import org.alexcawl.weather.android.androidLibraryConfiguration
import org.alexcawl.weather.buildToolsVersionValue
import org.alexcawl.weather.compileSdkValue
import org.alexcawl.weather.javaCompileTargetVersionValue
import org.alexcawl.weather.minSdkValue
import org.alexcawl.weather.ndkVersionValue
import org.alexcawl.weather.projectVersionCodeValue
import org.alexcawl.weather.projectVersionNameValue
import org.alexcawl.weather.targetSdkValue
import org.alexcawl.weather.toJavaVersion
import org.gradle.kotlin.dsl.maybeCreate

androidBaseConfiguration {
    compileSdk = compileSdkValue
    ndkVersion = ndkVersionValue

    buildFeatures {
        viewBinding = false
        buildConfig = false
        compose = true
    }

    defaultConfig {
        minSdk = minSdkValue
        buildToolsVersion = buildToolsVersionValue
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    lint {
        disable += listOf(
            "NewerVersionAvailable",
            "GradleDependency",
            "SelectableText",
            "Overdraw",
            "InvalidPackage",
            "TrustAllX509TrustManager",
            "ParcelCreator",
            "UnusedIds"
        )
        checkAllWarnings = true
        warningsAsErrors = true
    }

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }

    sourceSets {
        named("main").configure {
            java.srcDir("src/main/kotlin")
        }
    }

    compileOptions {
        sourceCompatibility = javaCompileTargetVersionValue.toJavaVersion()
        targetCompatibility = javaCompileTargetVersionValue.toJavaVersion()
    }

    //https://developer.android.com/studio/test/gradle-managed-devices
    testOptions {
        managedDevices.devices {
            maybeCreate<ManagedVirtualDevice>("pixel5").apply {
                device = "Pixel 5"
                apiLevel = targetSdkValue
                systemImageSource = "aosp"
            }
        }
    }
}

androidLibraryConfiguration {
    // Configure android library
}

androidApplicationConfiguration {
    defaultConfig {
        applicationId = ""
        versionCode = projectVersionCodeValue
        versionName = projectVersionNameValue
    }

    buildTypes {
        getByName("debug") {
            isMinifyEnabled = false
            isDebuggable = true
            applicationIdSuffix = ".debug"
        }

        getByName("release") {
            isMinifyEnabled = true
            multiDexEnabled = true
            isShrinkResources = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
            )
        }
    }
}
