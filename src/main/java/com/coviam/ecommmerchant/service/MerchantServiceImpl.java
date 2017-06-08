package com.coviam.ecommmerchant.service;

import com.coviam.ecommmerchant.dao.MerchantRepository;
import com.coviam.ecommmerchant.entity.Merchant;
import com.coviam.ecommmerchant.entity.MerchantInfoNameLogoRating;
import com.coviam.ecommmerchant.entity.MerchantInfoSoldDistinct;
import com.coviam.ecommmerchant.entity.MerchantInfoSoldDistinct;
import com.coviam.ecommmerchant.entity.MerchantInfoSoldDistinctRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

/**
 * Created by gaurav on 05/06/17.
 */

@Service
public class MerchantServiceImpl implements MerchantService {

    @Autowired
    MerchantRepository merchantRepository;

    @Value("${inventoryUri}")
    String inventoryUri;

    private RestTemplate restTemplate = new RestTemplate();

    @Override
    public Merchant getMerchant(int id) {
        return merchantRepository.findOne(id);
    }

    @Override
    public String getMerchantName(int merchantId) {
        return merchantRepository.getMerchantNameByMerchantid(merchantId);
    }

    @Override
    public MerchantInfoNameLogoRating getMerchantNameLogoRating(int id) {
        return merchantRepository.getMerchantNameLogoRating(id);
    }

    @Override
    public MerchantInfoSoldDistinctRating getProductSoldDistinctProductRating(int id) {
        return merchantRepository.getProductSoldDistinctProductRating(id);
    }

    @Override
    @Transactional(readOnly = false)
    public Merchant updateSoldDistinctOnOrderPlace(int productId, int merchantId, int quantity, int remainStock) {
        Merchant merchant = merchantRepository.findOne(merchantId);
        merchant.setProductsold(merchant.getDistinctproduct()+quantity);

        if(remainStock  == 0){
            merchant.setDistinctproduct(merchant.getDistinctproduct()-1);
        }

        return merchantRepository.save(merchant);
    }

    @Override
    public MerchantInfoSoldDistinct getProductSoldDistinctProduct(int id) {
        return merchantRepository.getProductSoldDistinctProduct(id);
    }


}
