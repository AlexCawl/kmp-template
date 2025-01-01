plugins {
    id("convention.project.server.application")
}

group = "org.alexcawl.weather"
version = "1.0.0"

application {
    mainClass.set("org.alexcawl.weather.ApplicationKt")
    applicationDefaultJvmArgs = listOf("-Dio.ktor.development=${extra["io.ktor.development"] ?: "false"}")
}

dependencies {
    implementation(projects.shared)
}
