package com.dps.bookfinderapp.repository;

import com.dps.bookfinderapp.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;


public interface BookRepository extends JpaRepository<Book,Long> {

    Set<Book> findAllByTitleContainingIgnoreCase(String title);
    Set<Book> findAllByAuthorContainingIgnoreCase(String author);
}
