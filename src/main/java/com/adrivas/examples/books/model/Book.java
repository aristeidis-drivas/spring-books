package com.adrivas.examples.books.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Book entity.
 */
@Entity
@Getter
@Setter
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false, unique = true)
    private String title;

    @Column(nullable = false)
    private String author;
}
