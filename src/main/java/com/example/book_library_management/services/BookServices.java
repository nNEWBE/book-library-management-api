package com.example.book_library_management.services;

import com.example.book_library_management.entity.Book;
import com.example.book_library_management.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServices {
    private final BookRepository bookRepository;

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Book not found"));
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book updateBook(Long id, Book book) {
        Book existingBook = bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Book not found"));

        if(book.getTitle() != null) {
            existingBook.setTitle(book.getTitle());
        }
        if(book.getAuthor() != null) {
            existingBook.setAuthor(book.getAuthor());
        }
        if(book.getPublication() != null) {
            existingBook.setPublication(book.getPublication());
        }
        if(book.getPublicationYear() != null) {
            existingBook.setPublicationYear(book.getPublicationYear());
        }
        if(book.getAvailableCopies() != null) {
            existingBook.setAvailableCopies(book.getAvailableCopies());
        }
        if(book.getGenre() != null) {
            existingBook.setGenre(book.getGenre());
        }
        return bookRepository.save(existingBook);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }

}
