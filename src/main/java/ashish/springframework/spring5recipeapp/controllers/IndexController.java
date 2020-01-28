package ashish.springframework.spring5recipeapp.controllers;


import ashish.springframework.spring5recipeapp.domain.Category;
import ashish.springframework.spring5recipeapp.domain.UnitOfMeasure;
import ashish.springframework.spring5recipeapp.repositories.CategoryRepository;
import ashish.springframework.spring5recipeapp.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    CategoryRepository categoryRepository;
    UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }


    @RequestMapping({"/","/index",""})
    public String getIndex(){
         System.out.println("My Recipe");
         Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
         Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");
        System.out.println("Category id:" + categoryOptional.get().getId());
        System.out.println("UOM id:" + unitOfMeasureOptional.get().getId());
         return "index";
    }
}
