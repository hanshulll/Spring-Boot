package org.hibernatepractice.crudoperations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernatepractice.entities.Address;
import org.hibernatepractice.entities.CustomerDetailsEntity;
import org.hibernatepractice.entities.StudentDetailEntity;
import org.hibernatepractice.factory.SessionFactoryProvider;

public class CreateUserInDB {
    public static void main(String[] args) {

//        StudentDetailEntity studentDetails = new StudentDetailEntity.Builder().name("Hanshul").rollNo(3).sAge(23).build();

//        SessionFactory sf = SessionFactoryProvider.sessionFactoryProvider(StudentDetailEntity.class);
//        Session session = sf.openSession();
//        Transaction transaction = session.beginTransaction();
//        session.persist(studentDetails);
//        transaction.commit();
//        session.close();
//        sf.close();
//        System.out.println(studentDetails);

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

        SessionFactory sf = SessionFactoryProvider.sessionFactoryProvider(CustomerDetailsEntity.class);
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(new CustomerDetailsEntity.Builder().id(1).name("Hanshul").mobileNumber("9999999999").age("23").isActive(true)
                .address(new Address.Builder().city("Pune").addressLine1("Crystal avenue").addressLine2("Baner").state("Maharashtra")
                        .build()).build());
        transaction.commit();
        session.close();
        sf.close();
//        System.out.println(customerDetailsEntity);
    }
}
