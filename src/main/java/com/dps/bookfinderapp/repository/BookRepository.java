package com.dps.bookfinderapp.repository;

import com.dps.bookfinderapp.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;



import java.util.List;


public interface BookRepository extends JpaRepository<Book,Long> {
    List<Book> findAllByTitleContaining(String title);
    List<Book> findAllByAuthorContaining(String author);
}
