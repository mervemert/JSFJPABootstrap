/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import domain.User;
import java.util.List;

/**
 *
 * @author merve.mert
 */
public interface UserService {
    
    public User insertUser(String name, String surname, String email, String password);
    
    public List<User> findAllUsers();
    
    public User findUserById(int id);
    
    public void removeUser(int id);
    
    public String login(String email, String password);
    
}
