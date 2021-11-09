package com.dps.bookfinderapp.Entity;

import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;


    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }
}
