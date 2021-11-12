package com.dps.bookfinderapp.controller;


import com.dps.bookfinderapp.Entity.Book;
import com.dps.bookfinderapp.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;


@Controller

public class BookController {

    @Autowired
    private BookServiceImpl bookService;

    @RequestMapping({"/", "/search"})
    public String listBooks(Model model, String searchTerm) {
        Set<Book> books = bookService.findAllByTitleOrAuthor(searchTerm);
        model.addAttribute("books", books);
        return "books/listOfBooks";

    }


}
