/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import domain.Book;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import service.BookService;
import service.BookServiceImpl;


/**
 *
 * @author merve.mert
 */
@ManagedBean
@SessionScoped
public class BookController {
    
    private String name;
    private String isbn;
    
    private List<Book> bookList = new ArrayList<Book>();
    
    @PostConstruct
    public void init(){
        BookService bookService = new BookServiceImpl();
        bookList = bookService.findAllBooks();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
    
    
    
    public void addBook(){
        BookService bookService = new BookServiceImpl();
        bookService.createBook(name, isbn);
    }
    
}
