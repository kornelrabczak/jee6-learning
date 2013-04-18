package ejb;

import entities.Book;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author nikom
 */
@Remote
public interface BookServiceRemote {
    public List<Book> findBooks();
    public Book findById(Long id);
    public Book create(Book book);
    public Book update(Book book);
    public void delete(Book book);
}
