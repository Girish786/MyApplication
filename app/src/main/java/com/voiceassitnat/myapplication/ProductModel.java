package com.voiceassitnat.myapplication;

public class ProductModel {
    String title,price,rate,image;

    public ProductModel(String title, String price, String rate, String image) {
        this.title = title;
        this.price = price;
        this.rate = rate;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
