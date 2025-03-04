package org.hibernatepractice.factory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryProvider {
    public static SessionFactory sessionFactoryProvider(Class<?> annotatedClass) {
        return new Configuration().addAnnotatedClass(annotatedClass)
                .configure().buildSessionFactory();
    }
}
