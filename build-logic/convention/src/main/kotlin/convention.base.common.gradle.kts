import org.alexcawl.weather.javaCompileTargetVersionValue
import org.alexcawl.weather.jvm.javaCompilerConfiguration
import org.alexcawl.weather.jvm.kotlinCompilerConfiguration
import org.alexcawl.weather.kotlinLanguageVersionValue
import org.alexcawl.weather.toJvmTarget
import org.alexcawl.weather.toKotlinVersion

kotlinCompilerConfiguration {
    jvmTarget.set(javaCompileTargetVersionValue.toJvmTarget())
    languageVersion.set(kotlinLanguageVersionValue.toKotlinVersion())
}

javaCompilerConfiguration {
    sourceCompatibility = javaCompileTargetVersionValue
    targetCompatibility = javaCompileTargetVersionValue
}
