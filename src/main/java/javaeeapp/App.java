package javaeeapp;

import entities.Book;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * @author nikom
 */
public class App {
    
    public static void main( String[] args ) {
        Book book = new Book();
        book.setDescription("Tu jest jakiś opis");
        book.setIllustration(true);
        book.setIsbn("123 -123 -asd");
        book.setPageNumber(15);
        book.setPrice(12.5F);
        book.setTitle("Dupa dupa");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("testUnit");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        
        tx.begin();
        em.persist(book);
        tx.commit();
        
        em.close();
        emf.close();
    }
}
