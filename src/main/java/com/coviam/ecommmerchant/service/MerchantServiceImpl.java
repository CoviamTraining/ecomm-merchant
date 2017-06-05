package com.coviam.ecommmerchant.service;

import com.coviam.ecommmerchant.dao.MerchantRepository;
import com.coviam.ecommmerchant.entity.Merchant;
import com.coviam.ecommmerchant.entity.MerchantInfoNameLogoRating;
import com.coviam.ecommmerchant.entity.MerchantInforSoldDistinct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gaurav on 05/06/17.
 */

@Service
public class MerchantServiceImpl implements MerchantService {

    @Autowired
    MerchantRepository merchantRepository;

    @Override
    public Merchant getMerchant(Integer id) {
        return merchantRepository.findOne(id);
    }

    @Override
    public MerchantInfoNameLogoRating getMerchantNameLogoRating(int id) {
        return merchantRepository.getMerchantNameLogoRating(id);
    }

    @Override
    public MerchantInforSoldDistinct getProductSoldDistinctProduct(int id) {
        return merchantRepository.getProductSoldDistinctProduct(id);
    }
}
