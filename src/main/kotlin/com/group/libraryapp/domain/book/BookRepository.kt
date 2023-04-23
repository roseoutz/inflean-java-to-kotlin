package com.group.libraryapp.domain.book

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface BookRepository: CrudRepository<Book, Long> {

    fun findByName(name: String): Book?

}