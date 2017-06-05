package com.coviam.ecommmerchant.service;


import com.coviam.ecommmerchant.entity.Merchant;
import com.coviam.ecommmerchant.entity.MerchantInfoNameLogoRating;
import com.coviam.ecommmerchant.entity.MerchantInforSoldDistinct;

/**
 * Created by gaurav on 05/06/17.
 */
public interface MerchantService {

    public Merchant getMerchant(Integer id);

    public MerchantInfoNameLogoRating getMerchantNameLogoRating(int id);

    public MerchantInforSoldDistinct getProductSoldDistinctProduct(int id);


}
