package org.alexcawl.demo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
