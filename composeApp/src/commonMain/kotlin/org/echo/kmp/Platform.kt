package org.echo.kmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform