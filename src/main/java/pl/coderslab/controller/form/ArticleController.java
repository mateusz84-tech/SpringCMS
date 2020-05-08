package pl.coderslab.controller.form;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.domain.dao.ArticleDao;

@Controller
@RequestMapping("/formArticle")
public class ArticleController {

    private final Logger log = LoggerFactory.getLogger(ArticleController.class);

    private final ArticleDao articleDao;

    public ArticleController(ArticleDao articleDao) {
        this.articleDao = articleDao;
    }

}
