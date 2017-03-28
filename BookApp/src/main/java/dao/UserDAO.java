/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.User;
import java.util.List;

/**
 *
 * @author merve.mert
 */
public interface UserDAO {
    
    public User insertUser(String name, String surname, String email, String password);
    
    public User findUserById(int id);
    
    public List<User> findAllUsers();
    
    public void removeUser(int id);
    
    
    public String login(String email, String password);
    
}
