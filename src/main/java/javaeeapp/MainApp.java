package javaeeapp;

import ejb.BookServiceRemote;
import entities.Book;
import javax.ejb.EJB;

/**
 *
 * @author nikom
 */
public class MainApp {

    @EJB
    private static BookServiceRemote ejb;
    
    public static void main(String[] args) {
        
        Book book = new Book();
        book.setTitle("testowy tytul");
        book.setDescription("jakis opis ksiazki");
        book.setIllustration(false);
        book.setPageNumber(54);
        book.setIsbn("ads - 23 -asd");
        book.setPrice(12.5F);
        
        ejb.create(book);
        
        book.setTitle("title changed");
        
        ejb.update(book);
        
        ejb.delete(book);
    }
}
