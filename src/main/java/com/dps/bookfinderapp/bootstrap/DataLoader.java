package com.dps.bookfinderapp.bootstrap;

import com.dps.bookfinderapp.Entity.Book;
import com.dps.bookfinderapp.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.Date;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private BookRepository bookRepository;
    Date publishedDate;


    public static Date provideDate(Calendar cal, int year, int day, int month) {
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month - 1);
        cal.set(Calendar.DAY_OF_MONTH, day);
        return cal.getTime();
    }

    @Override
    public void run(String... args) throws Exception {

        Calendar cal = Calendar.getInstance();

        Book book1 = new Book();
        book1.setTitle("The miracle morning");
        book1.setAuthor("Hal Elrod");
        publishedDate = provideDate(cal, 2012 ,7,12);
        book1.setPublishedDate(publishedDate);
        bookRepository.save(book1);

        Book book2 = new Book();
        book2.setTitle("And Then There Were None");
        book2.setAuthor("Agatha Christie");
        publishedDate = provideDate(cal, 1939 ,6,11);
        book2.setPublishedDate(publishedDate);
        bookRepository.save(book2);

        Book book3 = new Book();
        book3.setTitle("The Power of Habit");
        book3.setAuthor("Charles Duhigg");
        publishedDate = provideDate(cal, 2012 ,5,2);
        book3.setPublishedDate(publishedDate);
        bookRepository.save(book3);



    }
}
