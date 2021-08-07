package com.example.project.controllers;

import java.util.List;

import com.example.project.Models.Book;
import com.example.project.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    BookService bookService;
    @PostMapping("book/create")
    public Book createUser(@RequestBody Book book){
        return bookService.createBook(book);
    }
    @GetMapping("/book/all")
    public List<Book> getAllUser(){
        return bookService.getAllBook();
    }
    @GetMapping("/book/{book_id}")
    public Book getUserById(@PathVariable("book_id")Integer book_id){
        return bookService.getBookbyId(book_id);
    }
    @DeleteMapping("/book/{book_id}")
    public void deletetUserById(@PathVariable("book_id")Integer book_id){
        bookService.deleteBookbyId(book_id);
    }
	
}
