package com.group.librarayapp.service.book

import com.group.libraryapp.domain.book.BookRepository
import com.group.libraryapp.service.book.BookService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class BookServiceTest @Autowired constructor(
    private val bookService: BookService,
    private val bookRepository: BookRepository,
){

}