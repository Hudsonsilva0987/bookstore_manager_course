package com.hudsonsilva.bookstoremanager.controller;

import com.hudsonsilva.bookstoremanager.BookRepository;
import com.hudsonsilva.bookstoremanager.dto.MessageResponseDTO;
import com.hudsonsilva.bookstoremanager.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {
    BookRepository bookRepository;

    @Autowired
    public BookController (BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }
    @PostMapping
    public MessageResponseDTO create(@RequestBody  Book book){
        Book savedBook = bookRepository.save(book);
        return MessageResponseDTO
                .builder().message("Book Created with id : " + savedBook.getId())
                .build();
    }

}
