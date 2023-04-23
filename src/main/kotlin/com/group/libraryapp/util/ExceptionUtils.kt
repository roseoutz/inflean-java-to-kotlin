package com.group.libraryapp.util

import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.findByIdOrNull
import java.lang.IllegalArgumentException

fun fail(message: String?): Nothing {
    throw IllegalArgumentException(message)
}

fun <T, ID> CrudRepository<T, ID>.findByIdOrThrow(id: ID, message: String? = null): T {
    return this.findByIdOrNull(id) ?: fail(message)
}