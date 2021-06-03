package com.hudsonsilva.bookstoremanager.service;

import com.hudsonsilva.bookstoremanager.BookRepository;
import com.hudsonsilva.bookstoremanager.dto.BookDTO;
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


    public MessageResponseDTO create (BookDTO bookDTO){
        Book bookToSave = Book.builder()
                .name(bookDTO.getName())
                .pages(bookDTO.getPages())
                .chapters(bookDTO.getChapters())
                .isbn(bookDTO.getIsbn())
                .author(bookDTO.getAuthor())
                .build()
        Book saveBook = bookRepository.save(bookDTO);
        return MessageResponseDTO.builder().message("livro criado, ID :" + saveBook.getId()).build();
    }
}
