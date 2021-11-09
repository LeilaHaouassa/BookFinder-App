package com.dps.bookfinderapp.Entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "books")
public class Book extends BaseEntity {
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "published_date")
    private Date publishedDate ;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
