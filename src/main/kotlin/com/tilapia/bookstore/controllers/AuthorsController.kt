package com.tilapia.bookstore.controllers

import com.tilapia.bookstore.domain.dto.AuthorDto
import com.tilapia.bookstore.domain.entities.AuthorEntity
import com.tilapia.bookstore.services.AuthorService
import com.tilapia.bookstore.toAuthorDto
import com.tilapia.bookstore.toAuthorEntity
import org.springframework.http.HttpStatus
import org.springframework.http.HttpStatusCode
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class AuthorsController(private val authorService: AuthorService) {

    @PostMapping(path = ["/v1/authors"])
    fun createAuthor(@RequestBody authorDto: AuthorDto): ResponseEntity<AuthorDto> {
        val createdAuthor = authorService.save(
            authorDto.toAuthorEntity()
        ).toAuthorDto()
        return ResponseEntity(createdAuthor, HttpStatus.CREATED)
    }

}
