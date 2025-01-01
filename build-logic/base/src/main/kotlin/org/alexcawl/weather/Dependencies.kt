package org.alexcawl.weather

import org.gradle.accessors.dm.LibrariesForLibs
import org.gradle.api.Project
import org.gradle.api.artifacts.ExternalModuleDependencyBundle
import org.gradle.api.artifacts.MinimalExternalModuleDependency
import org.gradle.api.provider.Provider
import org.gradle.kotlin.dsl.DependencyHandlerScope
import org.gradle.kotlin.dsl.the

val Project.libs: LibrariesForLibs
    get() = the<LibrariesForLibs>()

fun DependencyHandlerScope.implementation(
    dependency: Provider<ExternalModuleDependencyBundle>
) {
    add("implementation", dependency)
}

fun DependencyHandlerScope.testImplementation(
    dependency: Provider<ExternalModuleDependencyBundle>
) {
    add("testImplementation", dependency)
}

fun DependencyHandlerScope.androidTestImplementation(
    dependency: Provider<ExternalModuleDependencyBundle>
) {
    add("androidTestImplementation", dependency)
}
