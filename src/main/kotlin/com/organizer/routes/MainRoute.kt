package com.organizer.routes

import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("ROOT")
        }
    }
}