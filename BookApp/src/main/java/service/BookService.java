/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import domain.Author;
import domain.Book;
import domain.Publisher;
import java.util.List;

/**
 *
 * @author merve.mert
 */
public interface BookService {
    
    public Book createBook(String name, String isbn);
    public List<Book> findAllBooks();
    public Author createAuthor(String name, String surname);
    public Publisher createPublisher(String name);
    
}
