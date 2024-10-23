package ru.itmo.api.mapper

import ru.itmo.api.model.Book
import ru.itmo.api.model.BookPage
import ru.itmo.api.model.Pageable

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
