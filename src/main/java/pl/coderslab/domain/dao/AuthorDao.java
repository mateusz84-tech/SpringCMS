package pl.coderslab.domain.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.coderslab.domain.model.Author;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
@Transactional
public class AuthorDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void create(Author author){

        entityManager.persist(author);
    }

    public Author read(Long id){

        return entityManager.find(Author.class, id);
    }

    public void update(Author author){

        entityManager.merge(author);
    }

    public void delete(Author author){

        entityManager.remove(entityManager.contains(author) ?
                author : entityManager.merge(author));
    }

    public List<Author> findAll(){
         TypedQuery<Author> query = entityManager.createQuery("SELECT a FROM Author a", Author.class);
         List<Author> authorList = query.getResultList();
         return authorList;
    }
}
