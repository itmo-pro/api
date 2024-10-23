package ru.itmo.api.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController
import ru.itmo.api.mapper.toBookPage
import ru.itmo.api.model.BookPage
import ru.itmo.api.service.BookService

@RestController
class ApiApiImpl(private val bookService: BookService) : ApiApi {

    override fun getBookPage(page: Int): ResponseEntity<BookPage> {
        return ResponseEntity.ok(bookService.find(page).toBookPage())
    }
}
