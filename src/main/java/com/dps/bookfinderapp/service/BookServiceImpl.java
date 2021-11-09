package com.dps.bookfinderapp.service;

import com.dps.bookfinderapp.Entity.Book;
import com.dps.bookfinderapp.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Set;

@Service
public class BookServiceImpl implements BookService<Book> {

    @Autowired
    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    @Override
    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public List<Book> findAllByTitle(String title) {
        return bookRepository.findAllByTitleContaining(title);
    }

    @Override
    public List<Book> findAllByAuthor(String author) {
        return bookRepository.findAllByAuthorContaining(author);
    }

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }


}
