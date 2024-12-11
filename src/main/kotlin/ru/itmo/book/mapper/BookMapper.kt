package ru.itmo.book.mapper

import ru.itmo.book.model.Book
import ru.itmo.book.model.BookPage
import ru.itmo.book.model.Pageable

fun Iterable<Book>.toBookPage(): BookPage = BookPage(
    content = toList(),
    empty = this.iterator().hasNext(),
    first = true,
    last = false,
    numberOfElements = count(),
    totalElements = count().toLong(),
    number = 1,
    totalPages = 42,
    sort = "id",
    pageable = Pageable(),
    propertySize = 1,

)
