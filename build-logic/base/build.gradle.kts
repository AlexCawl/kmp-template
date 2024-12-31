plugins {
    `kotlin-dsl`
}

dependencies {
    // Kotlin plugins
    implementation(libs.gradleplugin.kotlinMultiplatform)
    implementation(libs.gradleplugin.composeMultiplatform)
    implementation(libs.gradleplugin.composeCompiler)
    implementation(libs.gradleplugin.kotlinSerialization)

    // Android plugins
    implementation(libsAndroid.gradleplugin.android)

    // Jvm plugins
    // todo

    // Workaround for version catalog working inside precompiled scripts
    // Issue - https://github.com/gradle/gradle/issues/15383
    implementation(files(libs.javaClass.superclass.protectionDomain.codeSource.location))
    implementation(files(libsAndroid.javaClass.superclass.protectionDomain.codeSource.location))
    implementation(files(libsJvm.javaClass.superclass.protectionDomain.codeSource.location))
}