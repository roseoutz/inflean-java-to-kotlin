package com.group.libraryapp.domain.user

import com.group.libraryapp.domain.book.Book
import com.group.libraryapp.domain.user.loanhistory.UserLoanHistory
import java.lang.IllegalArgumentException
import javax.persistence.CascadeType
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.OneToMany

@Entity
class User(
    @Column(nullable = false)
    var name: String,

    val age: Int,

    @OneToMany(mappedBy = "user", cascade = [CascadeType.ALL], orphanRemoval = true)
    val userLoanHistories: MutableList<UserLoanHistory> = mutableListOf(),

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null
) {
    init {
        if (name.isBlank()) {
            throw IllegalStateException("name cannot be null")
        }
    }

    fun updateName(name: String) {
        this.name
    }

    fun loanBook(book: Book) {
        this.userLoanHistories.add(UserLoanHistory( this, book.name, false))
    }

    fun returnBook(bookName: String) {
        this.userLoanHistories.first { it.bookName == bookName }.doReturn()
    }
}