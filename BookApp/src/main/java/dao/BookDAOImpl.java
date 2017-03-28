/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Author;
import domain.Book;
import domain.Publisher;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import util.Utility;

/**
 *
 * @author merve.mert
 */
public class BookDAOImpl implements BookDAO{
    
    private EntityManager entityManager;

    public BookDAOImpl() {
        EntityManagerFactory emf =Utility.getEmf();
        entityManager = emf.createEntityManager();
    }
    
   
    @Override
    public Book createBook(String name, String isbn) {
        
       Book book = new Book(name, isbn);
       entityManager.getTransaction().begin();
       entityManager.persist(book);
       entityManager.getTransaction().commit();
       
       return book;
    }

    @Override
    public Author createAuthor(String name, String surname) {
        
        Author author = new Author(name, surname);
        entityManager.getTransaction().begin();
        entityManager.persist(author);
        entityManager.getTransaction().commit();
        
        return author;
        
    }

    @Override
    public Publisher createPublisher(String name) {
        
        Publisher publisher = new Publisher(name);
        entityManager.getTransaction().begin();
        entityManager.persist(publisher);
        entityManager.getTransaction().commit();
        
        return publisher;
    }

    @Override
    public List<Book> findAllBooks() {
        TypedQuery<Book> queryBook = entityManager.createQuery("Select b from Book b", Book.class);
        return queryBook.getResultList();
    }
    
}
