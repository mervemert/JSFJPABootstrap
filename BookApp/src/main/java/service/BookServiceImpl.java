/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.BookDAO;
import dao.BookDAOImpl;
import domain.Author;
import domain.Book;
import domain.Publisher;
import java.util.List;

/**
 *
 * @author merve.mert
 */
public class BookServiceImpl implements BookService{
    
    private BookDAO bookDAO;

    public BookServiceImpl() {
        
        bookDAO = new BookDAOImpl();
    }
    
    

    @Override
    public Book createBook(String name, String isbn) {
        return bookDAO.createBook(name, isbn);
    }

    @Override
    public Author createAuthor(String name, String surname) {
       return bookDAO.createAuthor(name, surname);
    }

    @Override
    public Publisher createPublisher(String name) {
      return bookDAO.createPublisher(name);
    }

    @Override
    public List<Book> findAllBooks() {
        return bookDAO.findAllBooks();
    }
    
    
    
}
