import org.alexcawl.weather.implementation
import org.alexcawl.weather.libs
import org.alexcawl.weather.testImplementation

plugins {
    id("convention.base.common")
}

dependencies {
    implementation(libs.bundles.jvm.source)
    testImplementation(libs.bundles.jvm.test)
}
