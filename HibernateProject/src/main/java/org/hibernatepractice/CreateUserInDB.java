package org.hibernatepractice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CreateUserInDB {
    public static void main(String[] args) {

        StudentDetailEntity studentDetails = new StudentDetailEntity.Builder().name("Hanshul").rollNo(3).sAge(23).build();

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(StudentDetailEntity.class)
                .configure().buildSessionFactory();
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(studentDetails);
        transaction.commit();
        session.close();
        sf.close();
        System.out.println(studentDetails);

         /*

        // first way of creating sessionFactory
        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(StudentDetail.class);
        cfg.configure();
        SessionFactory sf = cfg.buildSessionFactory();

         // Another way of instantiation of sessionFactory object instead of using above approach

         SessionFactory sf = new Configuration()
                                .addAnnotatedClass(StudentDetail.class)
                                .configure().buildSessionFactory();
         */
    }
}
