package entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

/**
 * @author nikom
 */
@Entity
@NamedQuery(name = Book.FIND_ALL, query = "SELECT b from Book b")
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;
    
    public static final String FIND_ALL = "Book.findAll";
    
    @Id
    @GeneratedValue
    private Long id;
    
    @Column(nullable = false)
    private String title;
    
    private Float price;
    
    @Column(length = 2000)
    private String description;
    
    private String isbn;
            
    private Integer pageNumber;
    
    private Boolean illustration;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Boolean getIllustration() {
        return illustration;
    }

    public void setIllustration(Boolean illustration) {
        this.illustration = illustration;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Book)) {
            return false;
        }
        Book other = (Book) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Book[ id=" + id + " ]";
    }
    
}
