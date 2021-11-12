package com.dps.bookfinderapp.Entity;

import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name ="books")
public class Book extends BaseEntity {
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date publishedDate ;

    private String title;

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
