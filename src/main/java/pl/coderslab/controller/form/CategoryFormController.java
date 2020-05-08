package pl.coderslab.controller.form;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.domain.dao.CategoryDao;
import pl.coderslab.domain.model.Category;

@Controller
@RequestMapping("/formCategory")
public class CategoryFormController {

    private final CategoryDao categoryDao;

    public CategoryFormController(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    @GetMapping("/add")
    public String prepareAddCategoryPage(Category category, Model model){
        model.addAttribute("category", new Category());
        return "category/add";
    }

    // zbieramy w żądaniu naszą encję
    @PostMapping("/add")
    public String processAddCategoryPage(String name,
                                         String description,
                                         Model model){
        Category category = new Category();
        category.setName(name);
        category.setDescription(description);
        categoryDao.create(category);
        model.addAttribute("category", category);
        return "category/success-add";
    }

    @PostMapping("/add-bind")
    public String processAddCategoryPageBind(Category category){
        categoryDao.create(category);
        return "category/success-add";

    }
    //=======================UPDATE==================================
    @GetMapping("/update")
    public String prepareEditCategory(Category category, Model model){
        model.addAttribute("category", new Category());
        return "/category/edit";
    }

    @PostMapping("/update-bind")
    public String processUpdateCategory(Category category){
        categoryDao.update(category);
        return "category/success-edit";
    }
    //=======================DELETE==================================
    @GetMapping("/delete")
    public String prepareDeleteCategory(Model model){
        model.addAttribute("category", new Category());
        return "/category/delete";
    }

    @PostMapping("/delete-bind")
    public String processDeleteCategory(Category category){
        categoryDao.delete(category);
        return "/category/success-delete";
    }
}
