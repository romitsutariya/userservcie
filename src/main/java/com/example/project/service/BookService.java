package com.example.project.service;

import java.util.List;

import com.example.project.Models.Book;
import com.example.project.Repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
  @Autowired
  BookRepository bookrepository;

  public Book createBook(Book book){
    return bookrepository.save(book);
  }
	public List<Book> getAllBook(){
    return bookrepository.findAll();
  }
  public Book getBookbyId(Integer  book_id){
    return bookrepository.findById(book_id).orElse(new Book());
  }
  public void deleteBookbyId(Integer  book_id){
     bookrepository.deleteById(book_id);
  }
  
  
}