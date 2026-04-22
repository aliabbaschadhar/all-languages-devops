import io.ktor.server.application.call
import io.ktor.server.application.install
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import io.ktor.server.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.jackson.jackson
import io.ktor.server.response.respond
import io.ktor.server.routing.get
import io.ktor.server.routing.routing

fun main() {
    val port = System.getenv("PORT")?.toIntOrNull() ?: 8080

    embeddedServer(Netty, port = port) {
        install(ContentNegotiation) {
            jackson()
        }

        routing {
            get("/") {
                val greeting = System.getenv("GREETING") ?: "Hello, World!"
                call.respond(mapOf("message" to greeting))
            }

            get("/health") {
                call.respond(mapOf("status" to "ok"))
            }
        }
    }.start(wait = true)
}
