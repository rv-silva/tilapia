package com.tilapia.bookstore.controllers

import com.tilapia.bookstore.domain.dto.AuthorDto
import com.tilapia.bookstore.services.AuthorService
import com.tilapia.bookstore.toAuthorDto
import com.tilapia.bookstore.toAuthorEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class AuthorsController(private val authorService: AuthorService) {

    @PostMapping(path = ["/v1/authors"])
    fun createAuthor(@RequestBody authorDto: AuthorDto): AuthorDto {
        return authorService.save(
            authorDto.toAuthorEntity()
        ).toAuthorDto()
    }

}
