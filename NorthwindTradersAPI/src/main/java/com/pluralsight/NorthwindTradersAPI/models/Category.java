package com.pluralsight.NorthwindTradersAPI.models;

import java.io.Serializable;

public class Category implements Serializable {
    private int categorieId;
    private String categoryName;


    public Category() {

    }

    public Category(int categorieId, String categoryName) {
        this.categorieId = categorieId;
        this.categoryName = categoryName;
    }

    public int getCategorieId() {
        return categorieId;
    }

    public void setCategorieId(int categorieId) {
        this.categorieId = categorieId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categorieId=" + categorieId +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }
}
