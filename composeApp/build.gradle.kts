plugins {
    id("convention.project.kmp.application")
}

android {
    namespace = "org.alexcawl.weather"

    defaultConfig {
        applicationId = "org.alexcawl.weather"
    }
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(libs.common.compose.resources)
        }
    }
}

dependencies {
    implementation(project(":shared"))
}
