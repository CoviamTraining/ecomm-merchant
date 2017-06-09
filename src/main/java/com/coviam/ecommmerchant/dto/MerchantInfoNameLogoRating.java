package com.coviam.ecommmerchant.dto;

/**
 * Created by gaurav on 05/06/17.
 */
public class MerchantInfoNameLogoRating {
    private String name;
    private String logo;
    private double rating;

    public MerchantInfoNameLogoRating(String name, String logo, double rating) {
        this.name = name;
        this.logo = logo;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "MerchantInfoNameLogoRating{" +
                "name='" + name + '\'' +
                ", logo='" + logo + '\'' +
                ", rating=" + rating +
                '}';
    }
}
