package com.coviam.ecommmerchant.service;


import com.coviam.ecommmerchant.entity.Merchant;
import com.coviam.ecommmerchant.entity.MerchantInfoNameLogoRating;
import com.coviam.ecommmerchant.entity.MerchantInfoSoldDistinct;
import com.coviam.ecommmerchant.entity.MerchantInfoSoldDistinctRating;

/**
 * Created by gaurav on 05/06/17.
 */
public interface MerchantService {

    public Merchant getMerchant(int id);

    public String getMerchantName(int merchantId);

    public MerchantInfoNameLogoRating getMerchantNameLogoRating(int id);

    public MerchantInfoSoldDistinctRating getProductSoldDistinctProductRating(int id);

    public MerchantInfoSoldDistinct getProductSoldDistinctProduct(int id);

    public Merchant updateSoldDistinctOnOrderPlace(int productId, int merchantId,int quantity, int remainStock);

}
