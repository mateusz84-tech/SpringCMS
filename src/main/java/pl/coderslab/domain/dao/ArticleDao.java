package pl.coderslab.domain.dao;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.coderslab.domain.model.Article;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.swing.text.html.parser.Entity;
import java.util.List;

@Repository
@Transactional
public class ArticleDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void create(Article article){

        entityManager.persist(article);
    }

    public Article read(Long id){

        return entityManager.find(Article.class, id);
    }

    public void update(Article article){

        entityManager.merge(article);
    }

    public void delete(Article article){

        entityManager.remove(entityManager.contains(article) ?
                article : entityManager.merge(article));
    }
    public List<Article> findAll(){
        TypedQuery<Article> query = entityManager.createQuery("SELECT a FROM Article a", Article.class);
        List<Article> articleList = query.getResultList();
        return articleList;
    }
}
