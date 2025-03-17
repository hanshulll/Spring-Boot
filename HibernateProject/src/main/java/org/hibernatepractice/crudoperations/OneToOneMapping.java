package org.hibernatepractice.crudoperations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernatepractice.entities.LaptopEntity;
import org.hibernatepractice.entities.StudentDetailEntity;

public class OneToOneMapping {
    public static void main(String[] args) {
        LaptopEntity laptopDetails = new LaptopEntity.Builder().lid(1).brand("Apple").ram(16).model("M1 pro").build();
        StudentDetailEntity studentDetails = new StudentDetailEntity.Builder().name("Hanshul").rollNo(1).sAge(23).laptop(laptopDetails).build();
        SessionFactory sf = new Configuration().addAnnotatedClass(StudentDetailEntity.class).addAnnotatedClass(LaptopEntity.class)
                .configure().buildSessionFactory();
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(laptopDetails);
        session.persist(studentDetails);
        transaction.commit();
        session.close();
        sf.close();
    }
}
