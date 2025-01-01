import org.alexcawl.weather.kotlin.kotlinMultiplatformConfiguration
import org.alexcawl.weather.kotlinJvmToolchainVersionValue
import org.alexcawl.weather.toJavaLanguageVersion

kotlinMultiplatformConfiguration {
    jvmToolchain {
        languageVersion.set(kotlinJvmToolchainVersionValue.toJavaLanguageVersion())
    }
}
