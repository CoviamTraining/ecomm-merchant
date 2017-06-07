package com.coviam.ecommmerchant.entity;

/**
 * Created by gaurav on 07/06/17.
 */
public class MerchantInfoSoldDistinct {
    private long productsold;
    private int distinctproduct;

    public MerchantInfoSoldDistinct(long productsold, int distinctproduct) {
        this.productsold = productsold;
        this.distinctproduct = distinctproduct;
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
                '}';
    }
}
