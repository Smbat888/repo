package com.example.smbat.myapplication.models;

/**
 * Created by smbat on 8/8/16.
 */
public class ProductCard {
    private int id;
    private int productImage;
    private String productTitle;
    private String productPrice;
    private String productDescription;

    public ProductCard() {
    }

    public ProductCard(int id, int productImage, String productTitle, String productPrice, String productDescription) {
        this.id = id;
        this.productImage = productImage;
        this.productTitle = productTitle;
        this.productPrice = productPrice;
        this.productDescription = productDescription;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getProductImage() {
        return productImage;
    }

    public void setProductImage(int productImage) {
        this.productImage = productImage;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }
}
