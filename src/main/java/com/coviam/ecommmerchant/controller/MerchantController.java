package com.coviam.ecommmerchant.controller;

import com.coviam.ecommmerchant.entity.Merchant;
import com.coviam.ecommmerchant.entity.MerchantInfoNameLogoRating;
import com.coviam.ecommmerchant.entity.MerchantInforSoldDistinct;
import com.coviam.ecommmerchant.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by gaurav on 05/06/17.
 */
public class MerchantController {

    @Autowired
    MerchantService merchantService;

    @RequestMapping(value = "/index")
    public String index(){
        return "HHK SDHJSA HKASF ASJHKF ASFSJA";
    }

    @RequestMapping(value = "/getmerchant/{id}")
    public Merchant getMerchant(@PathVariable Long id){
        return merchantService.getMerchant(id);
    }

    @RequestMapping(value = "/getmerchantnamelogorating/{id}")
    public MerchantInfoNameLogoRating getMerchantNameLogoRating(@PathVariable Long id){
        return merchantService.getMerchantNameLogoRating(id);
    }

    

    @RequestMapping(value = "/getsoldanddistinctproduct/{id}")
    public MerchantInforSoldDistinct getSoldAndDistinctProduct(@PathVariable Long id){
        return merchantService.getProductSoldDistinctProduct(id);
    }
}
