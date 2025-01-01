package org.alexcawl.weather.kotlin

import org.gradle.api.Project
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

inline fun Project.kotlinMultiplatformConfiguration(
    block: KotlinMultiplatformExtension.() -> Unit
) = block(kotlinMultiplatformExtension)
