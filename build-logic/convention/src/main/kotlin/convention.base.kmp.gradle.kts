import org.alexcawl.weather.kotlin.kotlinMultiplatformConfiguration
import org.alexcawl.weather.kotlinJvmToolchainVersionValue
import org.alexcawl.weather.libs
import org.alexcawl.weather.toJavaLanguageVersion

kotlinMultiplatformConfiguration {
    jvmToolchain {
        languageVersion.set(kotlinJvmToolchainVersionValue.toJavaLanguageVersion())
    }

    androidTarget()
    jvm()

    sourceSets {
        commonMain {
            dependencies {
                implementation(libs.common.kotlin.coroutines)
                implementation(libs.common.kotlin.serialization)
                implementation(libs.common.kotlin.serialization.json)
                implementation(libs.common.kotlin.datetime)
                implementation(libs.common.compose.animation)
                implementation(libs.common.compose.foundation)
                implementation(libs.common.compose.runtime)
                implementation(libs.common.compose.ui)
                runtimeOnly(libs.common.compose.resources)
                implementation(libs.common.compose.uiTooling)
                implementation(libs.common.ktor.client)
                implementation(libs.common.ktor.serialization)
            }
        }

        commonTest {
            dependencies {
                implementation(libs.common.junit)
                implementation(libs.common.kotlin.test)
                implementation(libs.common.kotlin.test.junit)
                implementation(libs.common.kotlin.test.coroutines)
            }
        }

        androidMain {
            dependencies {
                implementation(libs.android.kotlin)
                implementation(libs.android.kotlin.coroutines)
                implementation(libs.android.activityCompose)
                implementation(libs.android.splash)
                implementation(libs.android.lifecycle.runtime)
                implementation(libs.android.lifecycle.viewmodel)
                implementation(libs.android.lifecycle.extensions)
                implementation(libs.android.lifecycle.compose)
            }
        }

        androidInstrumentedTest {
            dependencies {
                implementation(libs.android.junit)
                implementation(libs.android.testManifest)
                implementation(libs.android.espresso)
            }
        }

        jvmMain {
            dependencies {
                implementation(libs.ktor.server.core)
                implementation(libs.ktor.server.netty)
                implementation(libs.logback)
            }
        }

        jvmTest {
            dependencies {

            }
        }
    }
}
