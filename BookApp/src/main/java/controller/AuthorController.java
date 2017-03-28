/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

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
public class AuthorController {
    
    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    public void addAuthor(){
        BookService bookService = new BookServiceImpl();
        bookService.createAuthor(name, surname);
    }
    
}
