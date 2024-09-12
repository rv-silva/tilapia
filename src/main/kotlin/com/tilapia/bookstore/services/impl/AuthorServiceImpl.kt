package com.tilapia.bookstore.services.impl

import com.tilapia.bookstore.domain.entities.AuthorEntity
import com.tilapia.bookstore.repositories.AuthorRepository
import com.tilapia.bookstore.services.AuthorService
import org.springframework.stereotype.Service

@Service
class AuthorServiceImpl(private val authorRepository: AuthorRepository): AuthorService {

    override fun save(authorEntity: AuthorEntity): AuthorEntity {
        return authorRepository.save(authorEntity)
    }

}
