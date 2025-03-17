package org.hibernatepractice.crudoperations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernatepractice.entities.Address;
import org.hibernatepractice.entities.CustomerDetailsEntity;
import org.hibernatepractice.entities.LaptopEntity;
import org.hibernatepractice.entities.StudentDetailEntity;

public class CreateUserInDB {
    public static void main(String[] args) {

        /*

        // FIRST WAY OF CREATING SESSION FACTORY

        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(StudentDetail.class);
        cfg.configure();
        SessionFactory sf = cfg.buildSessionFactory();

         // ANOTHER WAY OF INSTANTIATION OF SESSIONFACTORY OBJECT INSTEAD OF USING ABOVE APPROACH

         SessionFactory sf = new Configuration()
                                .addAnnotatedClass(StudentDetail.class)
                                .configure().buildSessionFactory();
         */

        ////////////////////////////////////////////
        ////// CREATE STUDENT DETAILS IN DB
        ////////////////////////////////////////////

//        StudentDetailEntity studentDetails = new StudentDetailEntity.Builder().name("Hanshul").rollNo(3).sAge(23).build();
//        SessionFactory sf = SessionFactoryProvider.sessionFactoryProvider(StudentDetailEntity.class);
//        Session session = sf.openSession();
//        Transaction transaction = session.beginTransaction();
//        session.persist(studentDetails);
//        transaction.commit();
//        session.close();
//        sf.close();
//        System.out.println(studentDetails);

        ////////////////////////////////////////////
        ////// CREATE CUSTOMER DETAILS IN DB
        ////////////////////////////////////////////

//        SessionFactory sf = SessionFactoryProvider.sessionFactoryProvider(CustomerDetailsEntity.class);
//        Session session = sf.openSession();
//        Transaction transaction = session.beginTransaction();
//        session.persist(new CustomerDetailsEntity.Builder().id(1).name("Hanshul").mobileNumber("9999999999").age("23").isActive(true)
//                .address(new Address.Builder().city("Pune").addressLine1("Crystal avenue").addressLine2("Baner").state("Maharashtra")
//                        .build()).build());
//        transaction.commit();
//        session.close();
//        sf.close();

    }
}
