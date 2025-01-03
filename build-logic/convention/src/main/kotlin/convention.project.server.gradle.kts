import org.alexcawl.weather.implementation
import org.alexcawl.weather.libs
import org.alexcawl.weather.testImplementation

plugins {
    id("io.gitlab.arturbosch.detekt")

    id("convention.base.common")
    id("convention.base.detekt")
}

dependencies {
    implementation(libs.bundles.jvm.source)
    testImplementation(libs.bundles.jvm.test)
}
