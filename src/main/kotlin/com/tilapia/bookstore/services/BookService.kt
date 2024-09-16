package com.tilapia.bookstore.services

import com.tilapia.bookstore.domain.BookSummary
import com.tilapia.bookstore.domain.BookUpdateRequest
import com.tilapia.bookstore.domain.entities.BookEntity

interface BookService {

    fun createUpdate(isbn: String, bookSummary: BookSummary): Pair<BookEntity, Boolean>

    fun list(authorId: Long?=null): List<BookEntity>

    fun get(isbn: String): BookEntity?

    fun partialUpdate(isbn: String, bookUpdateRequest: BookUpdateRequest): BookEntity

    fun delete(isbn: String)

}
