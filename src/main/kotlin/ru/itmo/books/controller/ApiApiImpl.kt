package ru.itmo.books.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController
import ru.itmo.books.mapper.toBookPage
import ru.itmo.books.model.BookPage
import ru.itmo.books.service.BookService

@RestController
class ApiApiImpl(private val bookService: BookService) : ApiApi {

    override fun getBookPage(page: Int): ResponseEntity<BookPage> {
        return ResponseEntity.ok(bookService.find(page).toBookPage())
    }
}
