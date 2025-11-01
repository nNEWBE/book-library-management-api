package com.example.book_library_management.controller;

import com.example.book_library_management.entity.Book;
import com.example.book_library_management.services.BookServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/books")
@RequiredArgsConstructor
public class BookController {
    private final BookServices bookServices;

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return bookServices.addBook(book);
    }
}
