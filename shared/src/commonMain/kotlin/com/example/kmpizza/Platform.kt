package com.example.kmpizza

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform