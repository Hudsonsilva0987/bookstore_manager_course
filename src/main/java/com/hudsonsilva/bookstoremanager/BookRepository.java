package com.hudsonsilva.bookstoremanager;

import com.hudsonsilva.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
