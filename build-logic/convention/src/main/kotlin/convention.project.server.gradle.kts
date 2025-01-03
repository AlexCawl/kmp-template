import org.alexcawl.plugins.implementation
import org.alexcawl.plugins.libs
import org.alexcawl.plugins.testImplementation

plugins {
    id("io.gitlab.arturbosch.detekt")

    id("convention.base.common")
    id("convention.base.detekt")
}

dependencies {
    implementation(libs.bundles.jvm.source)
    testImplementation(libs.bundles.jvm.test)
}
