package org.hibernatepractice.crudoperations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernatepractice.entities.StudentDetailEntity;
import org.hibernatepractice.factory.SessionFactoryProvider;

public class UpdateUserInDB {
    public static void main(String[] args) {
        SessionFactory sf = SessionFactoryProvider.sessionFactoryProvider(StudentDetailEntity.class);
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        StudentDetailEntity studentDetails = new StudentDetailEntity.Builder().name("Hanshul").rollNo(3).sAge(24).build();
        session.merge(studentDetails);
        transaction.commit();
        sf.close();
        session.close();
    }
}
