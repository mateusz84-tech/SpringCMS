package pl.coderslab.domain.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.coderslab.domain.model.Author;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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

    public Author update(Author author){

        return entityManager.merge(author);
    }

    public void delete(Author author){

        entityManager.remove(entityManager.contains(author) ?
                author : entityManager.merge(author));
    }
}
