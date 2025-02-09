package com.example.machineTest.controller;

import com.example.machineTest.model.Category;
import com.example.machineTest.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {
    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping
    public List<Category> getAllCategories(){
        return categoryRepository.findAll();
    }

    @PostMapping
    public Category createCategory(@RequestBody Category category){
        return categoryRepository.save(category);
    }

    @GetMapping("/{id}")
    public Category getCatetgoryById(@PathVariable Long id){
        return categoryRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Category updateCategory(@PathVariable Long id, @RequestBody Category categoryDetails){
        Category category=categoryRepository.findById(id).orElse(null);
        if(category!=null){
            category.setName(categoryDetails.getName());
            return categoryRepository.save(category);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable Long id){
        categoryRepository.deleteById(id);
    }
}
