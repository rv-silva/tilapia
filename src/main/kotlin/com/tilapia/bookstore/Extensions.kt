package com.tilapia.bookstore

import com.tilapia.bookstore.domain.AuthorSummary
import com.tilapia.bookstore.domain.AuthorUpdateRequest
import com.tilapia.bookstore.domain.BookSummary
import com.tilapia.bookstore.domain.dto.AuthorDto
import com.tilapia.bookstore.domain.dto.AuthorSummaryDto
import com.tilapia.bookstore.domain.dto.AuthorUpdateRequestDto
import com.tilapia.bookstore.domain.dto.BookSummaryDto
import com.tilapia.bookstore.domain.entities.AuthorEntity
import com.tilapia.bookstore.domain.entities.BookEntity
import com.tilapia.bookstore.exceptions.InvalidAuthorException

fun AuthorEntity.toAuthorDto() = AuthorDto(
    id = this.id,
    name = this.name,
    age = this.age,
    description = this.description,
    image = this.image
)

fun AuthorEntity.toAuthorSummaryDto(): AuthorSummaryDto{
    val authorId = this.id ?: throw InvalidAuthorException()
    return AuthorSummaryDto(
        id = authorId,
        name = this.name,
        image = this.image,
    )
}

fun AuthorDto.toAuthorEntity() = AuthorEntity(
    id = this.id,
    name = this.name,
    age = this.age,
    description = this.description,
    image = this.image
)

fun AuthorUpdateRequestDto.toAuthorUpdateRequest() = AuthorUpdateRequest(
    id = this.id,
    name = this.name,
    age = this.age,
    description = this.description,
    image = this.image
)

fun BookSummary.toBookEntity(author: AuthorEntity) = BookEntity(
    isbn=this.isbn,
    title=this.title,
    description = this.description,
    image = this.image,
    authorEntity = author
)

fun AuthorSummaryDto.toAuthorSummary() = AuthorSummary(
    id = this.id,
    name = this.name,
    image = this.image
)

fun BookSummaryDto.toBookSummary() = BookSummary(
    isbn = this.isbn,
    title = this.title,
    description = this.description,
    image = this.image,
    author = this.author.toAuthorSummary()
)

fun BookEntity.toBookSummaryDto() = BookSummaryDto(
    isbn = this.isbn,
    title = this.title,
    description = this.description,
    image = this.image,
    author = authorEntity.toAuthorSummaryDto()
)
