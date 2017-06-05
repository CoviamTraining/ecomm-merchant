package com.coviam.ecommmerchant.entity;

/**
 * Created by gaurav on 05/06/17.
 */
public class MerchantInforSoldDistinct {
    private long productsold;
    private int distinctproduct;

    public MerchantInforSoldDistinct(long productsold, int distinctproduct) {
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
}

