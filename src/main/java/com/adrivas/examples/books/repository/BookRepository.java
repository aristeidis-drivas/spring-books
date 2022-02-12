package com.adrivas.examples.books.repository;

import com.adrivas.examples.books.model.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Repository for Book entity operations.
 */
public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByTitle(String title);
}
