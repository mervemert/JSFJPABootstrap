/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.UserDAO;
import dao.UserDAOImpl;
import domain.User;
import java.util.List;

/**
 *
 * @author merve.mert
 */
public class UserServiceImpl implements UserService{
    
    //Service'den DAO'ya erişilir.
    private UserDAO userDAO;

    public UserServiceImpl() {
        
        userDAO = new UserDAOImpl();
    }
    
    

    @Override
    public User insertUser(String name, String surname, String email, String password) {
        return userDAO.insertUser(name, surname, email, password);
    }

    @Override
    public List<User> findAllUsers() {
       return userDAO.findAllUsers();
    }

    @Override
    public User findUserById(int id) {
        return userDAO.findUserById(id);
    }

    @Override
    public void removeUser(int id) {
        userDAO.removeUser(id);
    }

    @Override
    public String login(String email, String password) {
        return userDAO.login(email, password);
    }
    
    
    
}
