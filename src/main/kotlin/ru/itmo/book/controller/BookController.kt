package ru.itmo.book.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController
import ru.itmo.book.mapper.toBookPage
import ru.itmo.book.model.Book
import ru.itmo.book.model.BookPage
import ru.itmo.book.service.BookService
import ru.itmo.book.util.lazyLogger

@RestController
class BookController(private val bookService: BookService) : ApiApiController {

    private val log by lazyLogger()

    override fun getBookPage(page: Int): ResponseEntity<BookPage> {
        log.info("getBookPage(): page = [$page]")
        return ResponseEntity.ok(bookService.find(page).toBookPage())
    }

    override fun addBook(book: Book): ResponseEntity<Book> {
        log.info("addBook(): book={}", book)
        return ResponseEntity.ok(bookService.create(book))
    }
}
