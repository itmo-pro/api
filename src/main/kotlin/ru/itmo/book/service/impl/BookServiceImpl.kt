package ru.itmo.book.service.impl

import org.springframework.stereotype.Service
import ru.itmo.book.model.Book
import ru.itmo.book.service.BookService
import java.util.UUID
import java.util.concurrent.ConcurrentHashMap

@Service
class BookServiceImpl : BookService {

    override fun find(page: Int): Collection<Book> = bookMap.values

    override fun create(book: Book) = bookMap.put(book.id!!, book)!!

    companion object {


        private val bookMap: ConcurrentHashMap<UUID, Book> = ConcurrentHashMap<UUID, Book>().apply {
            putAll(
                listOf(
                    Book("foo", "foo author", 2024, UUID.randomUUID()),
                    Book("bar", "bar author", 2024, UUID.randomUUID()),
                    Book("zoo", "zoo author", 2024, UUID.randomUUID())
                ).associateBy { it.id!! }
            )
        }
    }
}
