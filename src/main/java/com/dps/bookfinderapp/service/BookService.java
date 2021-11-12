package com.dps.bookfinderapp.service;

import java.util.List;
import java.util.Set;


public interface BookService<T> {
    List<T> findAllBooks();

    Set<T> findAllByTitleOrAuthor(String searchTerm);

    T save(T book);
}
