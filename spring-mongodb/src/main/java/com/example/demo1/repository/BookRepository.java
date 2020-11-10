package com.example.demo1.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo1.model.Book;

public interface BookRepository extends MongoRepository<Book, Integer>{

}
