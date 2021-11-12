package com.dps.bookfinderapp.service;

import com.dps.bookfinderapp.Entity.Book;
import com.dps.bookfinderapp.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Service
public class BookServiceImpl implements BookService<Book> {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Set<Book> findAllByTitleOrAuthor(String searchTerm) {
        Set<Book> results;
        if(searchTerm != null) {
            Set<Book> booksFoundByTitle = bookRepository.findAllByTitleContainingIgnoreCase(searchTerm);
            Set<Book> booksFoundByAuthor = bookRepository.findAllByAuthorContainingIgnoreCase(searchTerm);
            results = new HashSet<Book>();
            results.addAll(booksFoundByAuthor);
            results.addAll(booksFoundByTitle);
        }else{
            results = new HashSet<Book>(findAllBooks());
        }
        return results;
    }


    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }


}
