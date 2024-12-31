package org.alexcawl.weather

import org.gradle.api.artifacts.MinimalExternalModuleDependency
import org.gradle.api.provider.Provider
import org.gradle.kotlin.dsl.DependencyHandlerScope

fun DependencyHandlerScope.implementation(
    dependency: Provider<MinimalExternalModuleDependency>
) {
    add(configurationName = "implementation", dependencyNotation = dependency)
}

fun DependencyHandlerScope.debugImplementation(
    dependency: Provider<MinimalExternalModuleDependency>
) {
    add(configurationName = "debugImplementation", dependencyNotation = dependency)
}
