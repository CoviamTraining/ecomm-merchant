package com.coviam.ecommmerchant.controller;

import com.coviam.ecommmerchant.entity.Merchant;
import com.coviam.ecommmerchant.entity.MerchantInfoNameLogoRating;
import com.coviam.ecommmerchant.entity.MerchantInfoSoldDistinct;
import com.coviam.ecommmerchant.entity.MerchantInfoSoldDistinctRating;
import com.coviam.ecommmerchant.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gaurav on 05/06/17.
 */

@RestController
public class MerchantController {

    @Autowired
    MerchantService merchantService;

    @RequestMapping(value = "/index")
    public String index(){
        return "HHK SDHJSA HKASF ASJHKF ASFSJA";
    }

    @RequestMapping(value = "/getMerchant/{id}")
    public Merchant getMerchant(@PathVariable Integer id){
        return merchantService.getMerchant(id);
    }

    @RequestMapping(value = "/getMerchantNameLogoRating/{id}")
    public MerchantInfoNameLogoRating getMerchantNameLogoRating(@PathVariable Long id){
        return merchantService.getMerchantNameLogoRating(Math.toIntExact(id));
    }

    @RequestMapping(value = "/getSoldAndDistinctProductRating/{id}")
    public MerchantInfoSoldDistinctRating getSoldAndDistinctProductRating(@PathVariable Long id){
        return merchantService.getProductSoldDistinctProductRating(Math.toIntExact(id));
    }

    @RequestMapping(value = "/getSoldAndDistinctProduct/{id}")
    public MerchantInfoSoldDistinct getSoldAndDistinctProduct(@PathVariable Long id){
        return merchantService.getProductSoldDistinctProduct(Math.toIntExact(id));
    }
}
