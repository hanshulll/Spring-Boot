package org.hibernatepractice.crudoperations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernatepractice.entities.AuthorEntity;
import org.hibernatepractice.entities.BookEntity;


import java.util.List;

public class ManyToMany {
    public static void main(String[] args) {
        AuthorEntity author1 = AuthorEntity.builder().name("Thomas H. Cormen").build();
        AuthorEntity author2 = AuthorEntity.builder().name("Charles E. Leiserson").build();
        AuthorEntity author3 = AuthorEntity.builder().name(" Ronald L. Rivest").build();
        AuthorEntity author4 = AuthorEntity.builder().name("Clifford Stein").build();
        BookEntity book1 = BookEntity.builder().title("Introduction to Algorithms").authors(List.of(author1,author2,author3,author4)).build();
        BookEntity book2= BookEntity.builder().title("Algorithms Unlocked").authors(List.of(author1)).build();
        author1.setBooks(List.of(book1,book2));
        author2.setBooks(List.of(book1));
        author3.setBooks(List.of(book1));
        author4.setBooks(List.of(book1));
        SessionFactory sf = new Configuration().addAnnotatedClass(AuthorEntity.class).addAnnotatedClass(BookEntity.class)
                .configure().buildSessionFactory();
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(author1);
        session.persist(author2);
        session.persist(author3);
        session.persist(author4);
        session.persist(book1);
        session.persist(book2);
        transaction.commit();
        session.close();
        sf.close();
    }
}
