package org.hibernatepractice.crudoperations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernatepractice.entities.LaptopEntity;
import org.hibernatepractice.entities.StudentDetailEntity;
import org.hibernatepractice.factory.SessionFactoryProvider;

import java.util.List;

public class HibernateQueryLanguage {
    public static void main(String[] args) {
        SessionFactory sf = SessionFactoryProvider.sessionFactoryProvider(LaptopEntity.class);
        Session session = sf.openSession();
        // select * from laptop where ram=32 ->SQL
        Query query = session.createQuery("from LaptopEntity",LaptopEntity.class);
        Query query1 = session.createQuery("from LaptopEntity where ram=32",LaptopEntity.class);
        List<LaptopEntity> laptops = query.getResultList();
        List<LaptopEntity> laptops32GbRam = query1.getResultList();
        System.out.println("All the laptops : " + laptops);
        System.out.println("Laptops with 32 gb ram : " + laptops32GbRam);

        String brand = "Asus";
        Query query3 = session.createQuery("select brand, model from LaptopEntity where brand like ?1");
        query3.setParameter(1, brand);

        List<Object[]> laptops1 = query3.getResultList();
        for (Object[] data : laptops1) {
            System.out.println((String) data[0] + " : " + (String) data[1]);
        }
        sf.close();
        session.close();
    }
}
