package com.example.backend

import api
import io.ktor.application.*
import io.ktor.routing.*

internal fun Application.module() {
    install(Routing) {
        this.api()
    }
}