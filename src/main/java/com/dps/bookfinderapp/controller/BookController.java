package com.dps.bookfinderapp.controller;


import com.dps.bookfinderapp.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookServiceImpl bookService;

    @RequestMapping({"","/"})
    public String listBooks(Model model){
        model.addAttribute("books",bookService.findAllBooks());
        return "books/listOfBooks";
    }



}
