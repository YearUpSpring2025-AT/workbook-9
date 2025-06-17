package com.pluralsight.NorthwindTradersAPI.models;

import java.io.Serializable;

public class Product  implements Serializable {
    private int productId;
    private String productName;
    private int categoryId;
    private double price;

    public Product() {
//        this.productId = productId;
    }

    public Product(int productId, String productName, int categoryId, double price) {
        this.productId = productId;
        this.productName = productName;
        this.categoryId = categoryId;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Product{");
        sb.append("productId=").append(productId);
        sb.append(", productName='").append(productName).append('\'');
        sb.append(", categoryId=").append(categoryId);
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
