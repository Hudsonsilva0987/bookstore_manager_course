package com.hudsonsilva.bookstoremanager.service;

import com.hudsonsilva.bookstoremanager.BookRepository;
import com.hudsonsilva.bookstoremanager.dto.MessageResponseDTO;
import com.hudsonsilva.bookstoremanager.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    public MessageResponseDTO create (Book book){
        Book saveBook = bookRepository.save(book);

        return MessageResponseDTO.builder().message("livro criado, ID :" + saveBook.getId()).build();
    }
}
