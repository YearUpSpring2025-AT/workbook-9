package com.pluralsight.NorthwindTradersAPI.controller;

import com.pluralsight.NorthwindTradersAPI.models.Category;
import com.pluralsight.NorthwindTradersAPI.models.Product;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class CategoriesController {

        @RequestMapping(path = "/categories", method = RequestMethod.GET)
        public List<Category> getCategory() {
            ArrayList<Category> categories = new ArrayList<>();

            categories.add(new Category(1, "Food"));
            categories.add(new Category(2, "Clothing"));
            return categories;

        }

        @RequestMapping(path = "/categories/{categoryId}", method = RequestMethod.GET)
        public List<Category> getCategory(@PathVariable int categoryId) {
            ArrayList<Category> categories = new ArrayList<>();

            categories.add(new Category(1, "Food"));
            categories.add(new Category(2, "Clothing"));

//            return categories.stream().filter(c -> c.getCategorieId() == categoryId).toList();

            for (Category c : categories) {
                if (c.getCategorieId() == categoryId) {
                    ArrayList<Category> resultingCategory = new ArrayList<>();
                    resultingCategory.add(c);
                    return resultingCategory;
                }

            }
            return new ArrayList<Category>();

        }
    }

