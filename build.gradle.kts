plugins {
    // this is necessary to avoid the plugins to be loaded multiple times
    // in each subproject's classloader
    alias(libsAndroid.plugins.androidApplication) apply false
    alias(libsAndroid.plugins.androidLibrary) apply false
    alias(libs.plugins.composeMultiplatform) apply false
    alias(libs.plugins.composeCompiler) apply false
    alias(libsJvm.plugins.kotlinJvm) apply false
    alias(libs.plugins.kotlinMultiplatform) apply false
}