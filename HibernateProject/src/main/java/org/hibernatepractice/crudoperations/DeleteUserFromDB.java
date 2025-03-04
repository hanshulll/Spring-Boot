package org.hibernatepractice.crudoperations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernatepractice.entities.StudentDetailEntity;
import org.hibernatepractice.factory.SessionFactoryProvider;

public class DeleteUserFromDB {
    public static void main(String[] args) {
        StudentDetailEntity studentDetailEntity = new StudentDetailEntity();
        SessionFactory sf = SessionFactoryProvider.sessionFactoryProvider(StudentDetailEntity.class);
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        studentDetailEntity = session.get(StudentDetailEntity.class,3);
        session.remove(studentDetailEntity);
        transaction.commit();
        session.close();
        sf.close();
        System.out.println(studentDetailEntity);
    }

}
