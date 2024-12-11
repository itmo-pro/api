package ru.itmo.books.service.impl

import org.springframework.stereotype.Service
import ru.itmo.books.model.Book
import ru.itmo.books.service.BookService
import java.util.UUID

@Service
class BookServiceImpl : BookService {

    override fun find(page: Int): List<Book> = listOf(
        Book("foo", "foo author", 2024, UUID.randomUUID()),
        Book("bar", "bar author", 2024, UUID.randomUUID()),
        Book("zoo", "zoo author", 2024, UUID.randomUUID())
    )

}
