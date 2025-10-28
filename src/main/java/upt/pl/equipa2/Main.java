package upt.pl.equipa2;

import org.hibernate.Session; 
import org.hibernate.SessionFactory; 
import org.hibernate.cfg.Configuration; 

public class Main { 
    public static void main(String[] args) { 
        // Build SessionFactory from configuration file 
        SessionFactory factory = new 
Configuration().configure().buildSessionFactory(); 

        // Open session 
        try (Session session = factory.openSession()) { 
            session.beginTransaction(); 
            Programming Laboratory 


            session.getTransaction().commit(); 

            System.out.println(" Students saved successfully!"); 
        } finally { 
            factory.close(); 
        } 
    } 

} 
