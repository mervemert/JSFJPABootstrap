/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.User;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import util.Utility;

/**
 *
 * @author merve.mert
 */
public class UserDAOImpl implements UserDAO{
    
    private EntityManager entityManager;
    
    public UserDAOImpl() {
        EntityManagerFactory entityManagerFactory = Utility.getEmf();
        entityManager = entityManagerFactory.createEntityManager();
    }

    @Override
    public User insertUser(String name, String surname, String email, String password) {
        User user = new User(name, surname, email, password);
        
        entityManager.getTransaction().begin();
        entityManager.persist(user);
        entityManager.getTransaction().commit();
        
        return user;
        
    }

    @Override
    public List<User> findAllUsers() {
      TypedQuery<User> query = entityManager.createQuery("Select u from User u", User.class);
      return query.getResultList();
    }

    @Override
    public User findUserById(int id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void removeUser(int id) {
       User user = findUserById(id);
       
       if(user != null) {
           entityManager.getTransaction().begin();
           entityManager.remove(user);
           entityManager.getTransaction().commit();
       }
    }

    @Override
    public String login(String email, String password) {
      
    
         TypedQuery<User> query = entityManager.createQuery("Select u from User u where u.email=:email and u.password=:password", User.class);
         query.setParameter("email", email);
         query.setParameter("password", password);
         
         try {
             User user = (User) query.getSingleResult();
             
             if(email.equalsIgnoreCase(user.getEmail()) && password.equals(user.getPassword())){
                 return "index";
             }
         }catch(Exception e){
             return null;
         }
        
         return "login";
    }
}

    

