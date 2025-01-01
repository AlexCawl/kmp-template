import org.alexcawl.weather.androidTestImplementation
import org.alexcawl.weather.implementation
import org.alexcawl.weather.libs
import org.alexcawl.weather.testImplementation
import org.gradle.kotlin.dsl.dependencies

plugins {
    id("convention.base.common")
    id("convention.base.android")
}

dependencies {
    implementation(libs.bundles.common.source)
    testImplementation(libs.bundles.common.test)
    implementation(libs.bundles.android.source)
    androidTestImplementation(libs.bundles.android.test)
}
