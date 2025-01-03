import org.alexcawl.weather.kotlin.kotlinMultiplatformConfiguration
import org.alexcawl.weather.libs
import org.jetbrains.compose.ExperimentalComposeLibrary

plugins {
    id("org.jetbrains.kotlin.multiplatform")
    id("org.jetbrains.compose")
    id("org.jetbrains.kotlin.plugin.compose")
    id("io.gitlab.arturbosch.detekt")

    id("convention.base.common")
    id("convention.base.android")
    id("convention.base.kmp")
    id("convention.base.detekt")
}

kotlinMultiplatformConfiguration {
    androidTarget()
    jvm()

    sourceSets {
        commonMain {
            dependencies {
                implementation(libs.bundles.common.source)
                implementation(compose.runtime)
                implementation(compose.foundation)
                implementation(compose.components.resources)
                implementation(compose.components.uiToolingPreview)
            }
        }

        commonTest {
            dependencies {
                implementation(libs.bundles.common.test)
                @OptIn(ExperimentalComposeLibrary::class)
                implementation(compose.uiTest)
            }
        }

        androidMain {
            dependencies {
                implementation(libs.bundles.android.source)
                implementation(compose.uiTooling)
            }
        }

        androidInstrumentedTest {
            dependencies {
                implementation(libs.bundles.android.test)
            }
        }

        jvmMain {
            dependencies {
                implementation(libs.bundles.jvm.source)
            }
        }

        jvmTest {
            dependencies {
                implementation(libs.bundles.jvm.test)
            }
        }
    }
}
