package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.domain.dao.ArticleDao;
import pl.coderslab.domain.model.Article;

@Controller
public class HomePageController {

    private final ArticleDao articleDao;

    public HomePageController(ArticleDao articleDao) {
        this.articleDao = articleDao;
    }

    @GetMapping("/")
    @ResponseBody
    public String home(Article article){
        return "Lista artykułów: "  + articleDao.findAll().toString();
    }
}
