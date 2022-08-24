package com.example.bookworm;

import java.io.Serializable;

public class Products {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPprice() {
        return pprice;
    }

    public void setPprice(String pprice) {
        this.pprice = pprice;
    }

    public String getPricee() {
        return pricee;
    }

    public void setPricee(String pricee) {
        this.pricee = pricee;
    }

    public int getBi() {
        return bi;
    }

    public void setBi(int bi) {
        this.bi = bi;
    }


    public String getDet() {
        return det;
    }

    public void setDet(String det) {
        this.det = det;
    }

    private String author;

    public Products(String name, String author, double price, String pprice, String pricee, int bi,  String det) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.pprice = pprice;
        this.pricee = pricee;
        this.bi = bi;

        this.det = det;
    }
    private String name;
    private double price;
    private String pprice;
    private String pricee;
    private  int bi;
    private String det;

}
