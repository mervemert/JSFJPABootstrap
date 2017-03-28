/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author merve.mert
 */
public class Utility {
    
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("BookAppUnit");

    public static EntityManagerFactory getEmf() {
        return emf;
    }
    
    
    
    
}
