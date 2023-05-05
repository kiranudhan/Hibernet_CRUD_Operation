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
//        Student student = new Student();
//        student.setName("swati");
//        student.setCity("beed");
//        student.setMobile("876543124");
//        
//        session.save(student);
        
        //update operation
//        //step 1:Fetch the records
//        Student student = (Student) session.get(Student.class, 1);
//        System.out.println("Before update :: " + student);
//        //step 2:Edit record
//        student.setName("swati");
//        System.out.println("After edit :: " + student);
//        //step 3:Update record
//        session.update(student);
        
        //delete operation
        //step 1:Fetch the records
        Student student=(Student) session.get(Student.class, 2);
        
        //step 2:Delete the records
        session.delete(student);
        
        
        
        transaction.commit();
        
        session.close();
        
        System.out.println("record deleted successfully");
    }
}
