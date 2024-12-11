package ru.itmo.books.service

import ru.itmo.books.model.Book

fun interface BookService {

    fun find(page: Int): List<Book>

}
