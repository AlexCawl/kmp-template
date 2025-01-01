import org.alexcawl.weather.kotlin.kotlinMultiplatformConfiguration

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.multiplatform")
    id("org.jetbrains.compose")
    id("org.jetbrains.kotlin.plugin.compose")

    id("convention.project.kmp")
}

kotlinMultiplatformConfiguration {
    sourceSets {
        jvmMain {
            dependencies {
                implementation(compose.desktop.currentOs)
            }
        }
    }
}
