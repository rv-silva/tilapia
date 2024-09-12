package com.tilapia.bookstore.controllers

import com.tilapia.bookstore.domain.entities.AuthorEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class AuthorsController {

    @PostMapping(path = ["/v1/authors"])
    fun createAuthor(@RequestBody authorEntity: AuthorEntity) {

    }

}
