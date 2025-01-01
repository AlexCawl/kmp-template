plugins {
    id("convention.project.kmp.application")
}

android {
    namespace = "org.alexcawl.weather"

    defaultConfig {
        applicationId = "org.alexcawl.weather"
    }
}

dependencies {
    implementation(project(":shared"))
}
