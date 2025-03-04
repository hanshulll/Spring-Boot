package org.hibernatepractice.crudoperations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernatepractice.entities.StudentDetailEntity;
import org.hibernatepractice.factory.SessionFactoryProvider;

public class ReadUserFromDB {
    public static void main(String[] args) {
        SessionFactory sf = SessionFactoryProvider.sessionFactoryProvider(StudentDetailEntity.class);
        Session session = sf.openSession();
        StudentDetailEntity s2 = session.get(StudentDetailEntity.class,3);
        sf.close();
        session.close();
        System.out.println(s2);
    }
}
