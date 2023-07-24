package com.junp.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.junp.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
