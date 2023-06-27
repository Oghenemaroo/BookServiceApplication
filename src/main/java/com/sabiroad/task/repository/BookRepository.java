package com.sabiroad.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sabiroad.task.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
