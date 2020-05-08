package pl.coderslab.controller.form;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.domain.dao.AuthorDao;
import pl.coderslab.domain.model.Author;

import java.util.List;

@Controller
@RequestMapping("/formAuthor")
public class AuthorController {

    private final AuthorDao authorDao;

    public AuthorController(AuthorDao authorDao) {
        this.authorDao = authorDao;
    }

    @GetMapping("/showAll")
    public String showAllAuthorsPage(Model model){
        List<Author> authorList =  authorDao.findAll();
        model.addAttribute("listOfAuthors", authorList);
        return "/author/showAll";
    }

    @GetMapping("/add")
    public String prepareAddAuthorsPage(Author author, Model model){
        model.addAttribute("author", new Author());
        return "/author/add";
    }
    @PostMapping("/add-bind")
    public String processAddAuthorPageBind(Author author){
        authorDao.create(author);
        return "/author/success-add";
    }
    //================UPDATE=====================
    @GetMapping("/update")
    public String prepareUpdateAuthorPage(Model model){
        model.addAttribute("author", new Author());
        return "/author/update";
    }
    @PostMapping("/update")
    public String processUpdateAuthorPageBind(Author author){
        authorDao.update(author);
        return "/author/success-update";
    }
    //================DELETE=====================
    @GetMapping("/delete")
    public String prepareDeleteAuthorPage(Model model){
        model.addAttribute("author", new Author());
        return "/author/delete";
    }
    @PostMapping("/delete")
    public String processDeleteAuthorsPageBin(Author author){
        authorDao.delete(author);
        return "/author/success-delete";
    }
}
