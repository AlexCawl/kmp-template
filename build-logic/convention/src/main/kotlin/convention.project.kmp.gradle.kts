import gradle.kotlin.dsl.accessors._d20b9a2835832c504173a50a2fd58d04.compose
import org.alexcawl.weather.kotlin.kotlinMultiplatformConfiguration
import org.alexcawl.weather.libs
import org.jetbrains.compose.ExperimentalComposeLibrary

plugins {
    id("convention.base.common")
    id("convention.base.android")
    id("convention.base.kmp")
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
