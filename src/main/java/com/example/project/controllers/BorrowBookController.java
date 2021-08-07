package com.example.project.controllers;

import com.example.project.Models.BorrowBook;
import com.example.project.service.BorrowBookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BorrowBookController {

	@Autowired
    BorrowBookService borrowBookService;
	
    @PostMapping(value="borrowbook/{book_id}")
    public BorrowBook borrowBook(@PathVariable("book_id") Integer book_id, @RequestBody BorrowBook borrowBook) {
       return  borrowBookService.borrowBook(borrowBook, book_id);
    }

    @GetMapping(value="borrowbook/{borrow_id}")
    public BorrowBook getBorrowBook(@PathVariable("borrow_id") Integer borrow_id){
        return  borrowBookService.getBorrowBookbyid(borrow_id);
    }

}
