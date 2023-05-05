package com.crud_operation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        
        SessionFactory sessionFactory=configuration.buildSessionFactory();
        
        Session session=sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        //to insert record we will create object
        Student student = new Student();
        student.setName("kiran");
        student.setCity("jalna");
        student.setMobile("9872625832");
        
        session.save(student);
        transaction.commit();
        
        session.close();
        
        System.out.println("record inserted successfully");
    }
}
