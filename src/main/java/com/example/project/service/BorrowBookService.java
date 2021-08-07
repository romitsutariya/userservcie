package com.example.project.service;

import com.example.project.Models.Book;
import com.example.project.Models.BorrowBook;
import com.example.project.Repository.BorrowBookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BorrowBookService {

	@Autowired
    BorrowBookRepository borrowbookrepo;
    @Autowired
    BookService bookService;

    public BorrowBook borrowBook(BorrowBook borrowBook,Integer book_id){
        Book book =bookService.getBookbyId(book_id) ;
        borrowBook.setBook(book);
        return borrowbookrepo.save(borrowBook);
    }

    public BorrowBook getBorrowBookbyid(Integer borrow_id){
        return borrowbookrepo.findById(borrow_id).orElse(new BorrowBook());
    }
}
