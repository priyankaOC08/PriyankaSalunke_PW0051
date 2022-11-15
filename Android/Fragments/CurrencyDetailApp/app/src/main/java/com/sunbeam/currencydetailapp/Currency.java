package com.sunbeam.currencydetailapp;

import java.io.Serializable;

public class Currency implements Serializable {


    private String country;
    private String symbol;
    private int rating;
    private  String description;

    public Currency() {

        this.country = "";
        this.symbol = "";
        this.rating = 0;
        this.description = "";
    }

    public Currency(String country, String symbol, int rating, String description) {
        this.country = country;
        this.symbol = symbol;
        this.rating = rating;
        this.description = description;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "country='" + country + '\'' +
                ", symbol='" + symbol + '\'' +
                ", rating=" + rating +
                ", description='" + description + '\'' +
                '}';
    }
}
