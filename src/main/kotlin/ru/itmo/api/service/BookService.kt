package ru.itmo.api.service

import ru.itmo.api.model.Book

fun interface BookService {

    fun find(page: Int): List<Book>

}
