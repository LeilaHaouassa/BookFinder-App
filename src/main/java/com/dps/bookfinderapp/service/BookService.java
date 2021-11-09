package com.dps.bookfinderapp.service;

import java.util.List;


public interface BookService<T> {
    List<T> findAllBooks();

    List<T> findAllByTitle(String title);

    List<T> findAllByAuthor( String author);

    T save(T book);
}
