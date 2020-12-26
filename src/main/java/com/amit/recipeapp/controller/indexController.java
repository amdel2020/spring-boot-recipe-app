package com.amit.recipeapp.controller;

import com.amit.recipeapp.domain.Category;
import com.amit.recipeapp.domain.UnitOfMeasure;
import com.amit.recipeapp.repositories.CategoryRepository;
import com.amit.recipeapp.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class indexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public indexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexName() {

        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("TeaSpoon");

        System.out.println(categoryOptional.get().getId() + " " + unitOfMeasureOptional.get().getId());

        return "index";
    }
}
