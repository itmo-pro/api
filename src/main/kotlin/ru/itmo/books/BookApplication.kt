package ru.itmo.books

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BookApplication

@Suppress("SpreadOperator")
fun main(args: Array<String>) {
    runApplication<BookApplication>(*args)
}
