package ejb;

import entities.Book;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author nikom
 */
@Stateless
public class BookService implements BookServiceRemote {
    
    @PersistenceContext(unitName = "testUnit")
    EntityManager em;

    @Override
    public List<Book> findBooks() {
        Query query = em.createNamedQuery(Book.FIND_ALL, Book.class);
        return query.getResultList();
    }

    @Override
    public Book findById(Long id) {
        return em.find(Book.class, id);
    }

    @Override
    public Book create(Book book) {
        em.persist(book);
        return book;
    }

    @Override
    public Book update(Book book) {
        return em.merge(book);
    }

    @Override
    public void delete(Book book) {
        em.remove(em.merge(book));
    }
}
