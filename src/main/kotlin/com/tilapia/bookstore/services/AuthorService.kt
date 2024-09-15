package com.tilapia.bookstore.services

import com.tilapia.bookstore.domain.entities.AuthorEntity

interface AuthorService {

    fun save(authorEntity: AuthorEntity): AuthorEntity

    fun list(): List<AuthorEntity>

    fun get(id: Long): AuthorEntity?

}
