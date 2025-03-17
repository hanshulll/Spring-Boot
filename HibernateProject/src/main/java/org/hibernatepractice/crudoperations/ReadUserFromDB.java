package org.hibernatepractice.crudoperations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernatepractice.entities.LaptopEntity;
import org.hibernatepractice.entities.StudentDetailEntity;
import org.hibernatepractice.factory.SessionFactoryProvider;

public class ReadUserFromDB {
    public static void main(String[] args) {
        SessionFactory sf =  new Configuration().addAnnotatedClass(StudentDetailEntity.class).addAnnotatedClass(LaptopEntity.class)
                .configure().buildSessionFactory();
        Session session = sf.openSession();
        StudentDetailEntity s2 = session.get(StudentDetailEntity.class,1);
        System.out.println(s2);
        sf.close();
        session.close();
    }
}
