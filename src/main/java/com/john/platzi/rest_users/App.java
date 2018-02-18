package com.john.platzi.rest_users;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.john.platzi.rest_users.model.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SessionFactory sessionFactory;
        Configuration configuration = new Configuration();
        configuration.configure();
        sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        
        User user = new User("j.pereiram","abc123",true);
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
    }
}
