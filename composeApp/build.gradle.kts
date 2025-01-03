plugins {
    id("convention.project.kmp.application")
}

android {
    namespace = "org.alexcawl.demo"

    defaultConfig {
        applicationId = "org.alexcawl.demo"
    }
}

dependencies {
    implementation(projects.shared)
}
