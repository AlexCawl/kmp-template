plugins {
    alias(libsJvm.plugins.kotlinJvm)
    alias(libsJvm.plugins.ktor)
    application
}

group = "org.alexcawl.weather"
version = "1.0.0"
application {
    mainClass.set("org.alexcawl.weather.ApplicationKt")
    applicationDefaultJvmArgs = listOf("-Dio.ktor.development=${extra["io.ktor.development"] ?: "false"}")
}

dependencies {
    implementation(projects.shared)
    implementation(libsJvm.logback)
    implementation(libsJvm.ktor.server.core)
    implementation(libsJvm.ktor.server.netty)
    testImplementation(libs.junit)
    testImplementation(libs.kotlin.test)
    testImplementation(libs.kotlin.test.junit)
}