package pl.coderslab.domain.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.coderslab.domain.model.Category;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class CategoryDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void create(Category category){

        entityManager.persist(category);
    }

    public Category read(Long id){

        return entityManager.find(Category.class, id);
    }

    public Category update(Category category){

        return entityManager.merge(category);
    }

    public void delete(Category category){

        entityManager.remove(entityManager.contains(category) ?
                category : entityManager.merge(category));
    }
}
