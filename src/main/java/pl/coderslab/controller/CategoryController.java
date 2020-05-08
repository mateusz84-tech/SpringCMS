package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.domain.dao.CategoryDao;
import pl.coderslab.domain.model.Category;

@Controller
@RequestMapping("/category")
public class CategoryController {

    private final CategoryDao categoryDao;

    public CategoryController(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    // akcja wyświetlająca wszystkie kategorie;
    @GetMapping("/showAll")
    @ResponseBody
    public String showAllCategory(){
        return "Wszystkie kategorie: " + categoryDao.findAll().toString();
    }
    // akcje dodające kategorie przez metodę get
    @GetMapping("/add/{name}/{description}")
    @ResponseBody
    public String addCategory(@PathVariable String name,
                              @PathVariable String description){
        Category category = new Category();
        category.setName(name);
        category.setDescription(description);
        categoryDao.create(category);
        return "Dodano nową kategorie: " + category.toString();
    }

    // akcja usuwająca kategorie z bazy
    @GetMapping("/delete/{id}")
    @ResponseBody
    public String deleteCategory(@PathVariable Long id){
        Category category = categoryDao.read(id);
        categoryDao.delete(category);
        return "Usunięto z bazy kategorię: " + category.getName();
    }
    // akcja edytująca kategorie
    @GetMapping("/update/{id}/{name}/{description}")
    @ResponseBody
    public String updateCategory(@PathVariable Long id,
                                 @PathVariable String name,
                                 @PathVariable String description){
        Category category = categoryDao.read(id);
        category.setName(name);
        category.setDescription(description);
        categoryDao.update(category);
        return " Pomyślnie zaktualizowano kategorię o id " + category.getId();
    }

}
