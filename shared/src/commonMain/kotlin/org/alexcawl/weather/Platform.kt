package org.alexcawl.weather

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
