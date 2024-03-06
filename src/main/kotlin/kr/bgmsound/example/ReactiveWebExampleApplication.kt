package kr.bgmsound.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ReactiveWebExampleApplication

fun main(args: Array<String>) {
    runApplication<ReactiveWebExampleApplication>(*args)
}
