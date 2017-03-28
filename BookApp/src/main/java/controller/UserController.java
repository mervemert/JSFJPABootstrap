/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import domain.User;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import service.UserService;
import service.UserServiceImpl;



/**
 *
 * @author merve.mert
 */
@ManagedBean
@SessionScoped
public class UserController {
    
    //bind edilenler çağırılır
    private String name;
    private String surname;
    private String email;
    private String password;
    
    private List<User> userList = new ArrayList<User>();
    
    @PostConstruct
    public void init(){
        UserService userService = new UserServiceImpl();
        userList = userService.findAllUsers();
    }
    

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
    
  
  
    
    public void addUser(){
        
        //controllerdan service çağırılır
        UserService userService = new UserServiceImpl();
        userService.insertUser(name, surname, email, password);
                
        //userList her zaman güncellenecek
        userList = userService.findAllUsers();
        
    }
    
    public void login(){
        
        UserService userService = new UserServiceImpl();
        userService.login(email, password);
    }
 
    
    public void deleteUser(int id){
        
        UserService userService = new UserServiceImpl();
        userService.removeUser(id);
        
        userList = userService.findAllUsers();
        
    }
    
 
}
