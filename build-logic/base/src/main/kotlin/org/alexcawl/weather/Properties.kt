package org.alexcawl.weather

import org.gradle.api.Project

val Project.compileSdkValue: Int
    get() = properties["ww.android.compileSdk"].toString().toInt()

val Project.targetSdkValue: Int
    get() = properties["ww.android.targetSdk"].toString().toInt()

val Project.minSdkValue: Int
    get() = properties["ww.android.minSdk"].toString().toInt()

val Project.buildToolsVersionValue: String
    get() = properties["ww.android.buildToolsVersion"].toString()

val Project.ndkVersionValue: String
    get() = properties["ww.android.ndkVersion"].toString()

val Project.javaCompileTargetVersion: String
    get() = properties["ww.java.compileTargetVersion"].toString()

val Project.kotlinJvmToolchainVersion: String
    get() = properties["ww.kotlin.jvmToolchainVersion"].toString()

val Project.kotlinLanguageVersion: String
    get() = properties["ww.kotlin.languageVersion"].toString()
