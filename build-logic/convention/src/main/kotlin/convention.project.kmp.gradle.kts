import org.alexcawl.weather.kotlin.kotlinMultiplatformConfiguration
import org.alexcawl.weather.libs

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
            }
        }

        commonTest {
            dependencies {
                implementation(libs.bundles.common.test)
            }
        }

        androidMain {
            dependencies {
                implementation(libs.bundles.android.source)
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
