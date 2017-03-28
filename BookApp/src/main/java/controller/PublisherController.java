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
public class PublisherController {
    
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void addPublisher(){
        BookService bookService = new BookServiceImpl();
        bookService.createPublisher(name);
    }
    
}
