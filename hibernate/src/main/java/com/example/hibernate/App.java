package com.example.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
//import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */

public class App 
{
    @SuppressWarnings("deprecation")
	public static void main( String[] args )
    {
//    	 Configuration conn = new Configuration().configure("hibernate.cfg.xml");
//         
//         SessionFactory sf =conn.buildSessionFactory();
//         
//         Session s = sf.openSession();
//         
//         s.beginTransaction();
//         
//         s.save(s);
//         
//         s.getTransaction().commit();      
//    	  Configuration conn = new Configuration().configure("hibernate.cfg.xml");
	      
    	  StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
    	  
    	  Metadata mt = new MetadataSources(ssr).getMetadataBuilder().build();
    	  
	      SessionFactory sf =mt.buildSessionFactory();
	      
	      Session s = sf.openSession();
	      
	      Transaction t = s.beginTransaction();
	      
	      worker w = new worker();
	      
	      w.setName("manoj");
	      
	      w.setEmail("manoj90430@gmail.com");
	      
	      w.setPassword("manoj");
	      
	      w.setPhno(1234567899);
	      
	      s.save(w);
	      
	      t.commit();
	      
	      System.out.println("successfully inserted");
	      
	      sf.close();
	      
	      s.close();
      
        
    }
}
