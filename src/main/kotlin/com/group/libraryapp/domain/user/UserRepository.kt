package com.group.libraryapp.domain.user

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository:CrudRepository<User, Long> {

    fun findByName(name:String): User?
}