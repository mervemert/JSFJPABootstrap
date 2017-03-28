/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 *
 * @author merve.mert
 */
@Entity
public class Book {
    
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    private String name;
    private String isbn;
    
    
    @ManyToMany
    @JoinTable(name = "BOOK_AUTHOR", joinColumns=@JoinColumn(name="BOOK_ID"), inverseJoinColumns=@JoinColumn(name ="AUTHOR_ID"))
    private List<Author> authors = new ArrayList<Author>();
    
    @ManyToMany
    @JoinTable(name = "BOOK_PUBLISHER", joinColumns = @JoinColumn(name="BOOK_ID"), inverseJoinColumns = @JoinColumn(name="PUBLISHER_ID"))
    private List<Publisher> publishers = new ArrayList<Publisher>();

    public Book() {
    }
    
    

    public Book(String name, String isbn) {
        this.name = name;
        this.isbn = isbn;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public List<Publisher> getPublishers() {
        return publishers;
    }

    public void setPublishers(List<Publisher> publishers) {
        this.publishers = publishers;
    }
    
    
    
    
}
