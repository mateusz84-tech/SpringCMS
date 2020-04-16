package pl.coderslab.domain.dao;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.coderslab.domain.model.Article;

import javax.persistence.EntityManager;
import javax.swing.text.html.parser.Entity;

@Repository
@Transactional
public class ArticleDao {

    private EntityManager entityManager;

    public void create(Article article){

        entityManager.persist(article);
    }

    public Article read(Long id){

        return entityManager.find(Article.class, id);
    }

    public Article update(Article article){

        return entityManager.merge(article);
    }

    public void delete(Article article){

        entityManager.remove(entityManager.contains(article) ?
                article : entityManager.merge(article));
    }
}
