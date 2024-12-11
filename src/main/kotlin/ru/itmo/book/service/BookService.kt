package ru.itmo.book.service

import ru.itmo.book.model.Book

interface BookService {

    fun find(page: Int): Collection<Book>
    fun create(book: Book): Book

}
