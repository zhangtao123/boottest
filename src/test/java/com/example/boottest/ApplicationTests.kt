package com.example.boottest

import com.example.boottest.entity.Book
import com.example.boottest.service.BookService
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.annotation.Resource

@RunWith(SpringRunner::class)
@SpringBootTest
class ApplicationTest {
    @Resource
    private val bookService: BookService? = null

    @Test
    fun test() {
        val book = Book()
        book.title = "test"
        book.author = "yibo"
        book.description = "测试Kotlin"
        bookService?.addBook(book)
        print(book)
    }
}