package org.alexcawl.weather

import org.gradle.api.Project

// Android properties
val Project.compileSdkValue: Int
    get() = properties["compileSdk"]?.toString()?.toInt()
        ?: error("Field \"compileSdk\" not found in gradle.properties")

val Project.targetSdkValue: Int
    get() = properties["targetSdk"]?.toString()?.toInt()
        ?: error("Field \"targetSdk\" not found in gradle.properties")

val Project.minSdkValue: Int
    get() = properties["minSdk"]?.toString()?.toInt()
        ?: error("Field \"minSdk\" not found in gradle.properties")

val Project.buildToolsVersionValue: String
    get() = properties["buildToolsVersion"]?.toString()
        ?: error("Field \"buildToolsVersion\" not found in gradle.properties")

val Project.ndkVersionValue: String
    get() = properties["ndkVersion"]?.toString()
        ?: error("Field \"ndkVersion\" not found in gradle.properties")

// Java properties
val Project.javaCompileTargetVersionValue: String
    get() = properties["compileTargetVersion"]?.toString()
        ?: error("Field \"compileTargetVersion\" not found in gradle.properties")

// Kotlin properties
val Project.kotlinJvmToolchainVersionValue: String
    get() = properties["jvmToolchainVersion"]?.toString()
        ?: error("Field \"jvmToolchainVersion\" not found in gradle.properties")

val Project.kotlinLanguageVersionValue: String
    get() = properties["kotlinLanguageVersion"]?.toString()
        ?: error("Field \"kotlinLanguageVersion\" not found in gradle.properties")

// Versioning properties
val Project.majorValue: Int
    get() = properties["MAJOR"]?.toString()?.toIntOrNull()
        ?: error("Field \"MAJOR\" not found in gradle.properties")

val Project.minorValue: Int
    get() = properties["MINOR"]?.toString()?.toIntOrNull()
        ?: error("Field \"MINOR\" not found in gradle.properties")

val Project.patchValue: Int
    get() = properties["PATCH"]?.toString()?.toIntOrNull()
        ?: error("Field \"PATCH\" not found in gradle.properties")
