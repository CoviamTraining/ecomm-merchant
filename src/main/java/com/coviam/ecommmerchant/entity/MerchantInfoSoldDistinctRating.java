package com.coviam.ecommmerchant.entity;

/**
 * Created by gaurav on 05/06/17.
 */
public class MerchantInfoSoldDistinctRating {
    private long productsold;
    private int distinctproduct;
    private double rating;

    public MerchantInfoSoldDistinctRating(long productsold, int distinctproduct, double rating) {
        this.productsold = productsold;
        this.distinctproduct = distinctproduct;
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public long getProductsold() {
        return productsold;
    }

    public void setProductsold(long productsold) {
        this.productsold = productsold;
    }

    public int getDistinctproduct() {
        return distinctproduct;
    }

    public void setDistinctproduct(int distinctproduct) {
        this.distinctproduct = distinctproduct;
    }

    @Override
    public String toString() {
        return "MerchantInforSoldDistinct{" +
                "productsold=" + productsold +
                ", distinctproduct=" + distinctproduct +
                ", rating=" + rating +
                '}';
    }
}

