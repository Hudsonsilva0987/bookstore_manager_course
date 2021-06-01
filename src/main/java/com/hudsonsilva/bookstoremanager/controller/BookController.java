package com.hudsonsilva.bookstoremanager.controller;


import com.hudsonsilva.bookstoremanager.dto.MessageResponseDTO;
import com.hudsonsilva.bookstoremanager.entity.Book;
import com.hudsonsilva.bookstoremanager.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {
    BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    MessageResponseDTO create(@RequestBody Book book){
        return bookService.create(book);
    }
}
