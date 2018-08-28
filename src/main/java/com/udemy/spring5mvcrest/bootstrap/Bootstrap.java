package com.udemy.spring5mvcrest.bootstrap;

import com.udemy.spring5mvcrest.domain.Category;
import com.udemy.spring5mvcrest.repositories.CategoryRepository;
import org.springframework.boot.CommandLineRunner;

public class Bootstrap implements CommandLineRunner {

    private CategoryRepository categoryRepository;

    public Bootstrap(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    //Spring Bot specific
    @Override
    public void run(String... args) throws Exception {

        Category fruitsCategory = new Category();
        fruitsCategory.setName("Fruits");

        Category freshCategory = new Category();
        freshCategory.setName("Fresh");

        Category driedCategory = new Category();
        driedCategory.setName("Dried");

        Category exoticCategory = new Category();
        exoticCategory.setName("Exotic");

        Category nutsCategory = new Category();
        nutsCategory.setName("Nuts");

        categoryRepository.save(fruitsCategory);
        categoryRepository.save(freshCategory);
        categoryRepository.save(driedCategory);
        categoryRepository.save(exoticCategory);
        categoryRepository.save(nutsCategory);

        System.out.println("Data loaded = " + categoryRepository.count());
    }
}
