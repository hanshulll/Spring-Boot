package org.hibernatepractice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("John");
        s1.setRollNo(1);
        s1.setsAge(18);

        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(org.hibernatepractice.Student.class);
        cfg.configure();
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        session.save(s1);
        System.out.println(s1);
    }
}