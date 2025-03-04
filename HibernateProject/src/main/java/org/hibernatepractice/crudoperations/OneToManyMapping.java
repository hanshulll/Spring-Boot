package org.hibernatepractice.crudoperations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernatepractice.entities.Address;
import org.hibernatepractice.entities.CustomerDetailsEntity;
import org.hibernatepractice.entities.LaptopEntity;
import org.hibernatepractice.entities.OrderEntity;
import org.hibernatepractice.entities.StudentDetailEntity;

import java.util.Arrays;

public class OneToManyMapping {
    public static void main(String[] args) {
        OrderEntity order1 = new OrderEntity().builder().id(1).product("MacBook").build();
        OrderEntity order2 = new OrderEntity().builder().id(2).product("Bike").build();
    //        System.out.println(order2);
    //        System.out.println(order1);
        CustomerDetailsEntity customerDetails = new CustomerDetailsEntity.Builder().id(2)
                .name("Hanshul").age("23").mobileNumber("9999993333").isActive(true).address(new Address.Builder().city("Pune").addressLine1("Crystal avenue").addressLine2("Baner").state("Maharashtra")
                        .build()).orders(Arrays.asList(order1,order2)).build();
        System.out.println(customerDetails);
        SessionFactory sf = new Configuration().addAnnotatedClass(OrderEntity.class).addAnnotatedClass(CustomerDetailsEntity.class)
                .configure().buildSessionFactory();
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(order1);
        session.persist(order2);
        session.persist(customerDetails);
        transaction.commit();
        session.close();
        sf.close();
    }
}
