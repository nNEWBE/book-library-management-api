package com.example.book_library_management.controller;

import com.example.book_library_management.entity.Book;
import com.example.book_library_management.services.BookServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/books")
@RequiredArgsConstructor
public class BookController {
    private final BookServices bookServices;

    @PostMapping
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
       Book savedBook = bookServices.addBook(book);
       return ResponseEntity.ok(savedBook);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
        Book book = bookServices.getBookById(id);
        return ResponseEntity.ok(book);
    }
}
