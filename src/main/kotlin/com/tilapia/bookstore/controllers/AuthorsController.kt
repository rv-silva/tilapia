package com.tilapia.bookstore.controllers

import com.tilapia.bookstore.domain.dto.AuthorDto
import com.tilapia.bookstore.domain.entities.AuthorEntity
import com.tilapia.bookstore.services.AuthorService
import com.tilapia.bookstore.toAuthorDto
import com.tilapia.bookstore.toAuthorEntity
import org.springframework.http.HttpStatus
import org.springframework.http.HttpStatusCode
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(path = ["/v1/authors"])
class AuthorsController(private val authorService: AuthorService) {

    @PostMapping
    fun createAuthor(@RequestBody authorDto: AuthorDto): ResponseEntity<AuthorDto> {
        val createdAuthor = authorService.save(
            authorDto.toAuthorEntity()
        ).toAuthorDto()
        return ResponseEntity(createdAuthor, HttpStatus.CREATED)
    }

    @GetMapping
    fun readManyAuthor(): List<AuthorDto> {
        return authorService.list().map { it.toAuthorDto() }
    }

}
