package pl.coderslab.domain.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.coderslab.domain.model.Category;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

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

    public void update(Category category){
        entityManager.merge(category);
    }

    public void delete(Category category){

        entityManager.remove(entityManager.contains(category) ?
                category : entityManager.merge(category));
    }
    public List<Category> findAll(){
        TypedQuery<Category> query = entityManager.createQuery("SELECT c FROM Category c", Category.class);
        List<Category> categoryList = query.getResultList();
        return categoryList;
    }
}
