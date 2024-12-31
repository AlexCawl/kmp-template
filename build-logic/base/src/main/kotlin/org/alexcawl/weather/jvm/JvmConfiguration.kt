package org.alexcawl.weather.jvm

import org.gradle.api.Project
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmCompilerOptions
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmExtension
import org.jetbrains.kotlin.gradle.tasks.KotlinJvmCompile

fun Project.jvmCompilerConfiguration(
    block: KotlinJvmExtension.() -> Unit
) = block(jvmExtension)

fun Project.jvmCompilerConfiguration(
    block: KotlinJvmCompilerOptions.() -> Unit
) {
    tasks.withType<KotlinJvmCompile>().configureEach {
        compilerOptions(block)
    }
}
