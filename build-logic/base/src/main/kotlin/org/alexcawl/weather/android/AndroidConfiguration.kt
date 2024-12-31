package org.alexcawl.weather.android

import org.gradle.api.Project

internal inline fun <reified T : AndroidExtensions> Project.androidConfiguration(
    androidConfigurationBlock: T.() -> Unit
) = androidConfigurationBlock(androidExtension as T)
