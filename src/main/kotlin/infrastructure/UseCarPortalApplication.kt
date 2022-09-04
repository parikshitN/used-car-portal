package infrastructure

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class UseCarPortalApplication

fun main(args : Array<String>) {
    runApplication<UseCarPortalApplication>(*args)
}