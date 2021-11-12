package com.dps.bookfinderapp.service;

import java.util.Set;


public interface BookService<T> {
    Set<T> findAllBooks();

    Set<T> findAllByTitleOrAuthor(String searchTerm);

    T save(T book);
}
