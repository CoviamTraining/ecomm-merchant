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
    public Merchant getMerchant(Integer id) {
        return merchantRepository.findOne(id);
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
    public Merchant updateSoldDistinctOnOrderPlace(int productId, int merchantId) {
        Merchant merchant = merchantRepository.findOne(merchantId);
        merchant.setProductsold(merchant.getDistinctproduct()+1);

        int stock = restTemplate.getForObject(inventoryUri+"getstock/"+productId+"/"+merchantId, Integer.class);
        if(stock == 0){
            merchant.setDistinctproduct(merchant.getDistinctproduct()-1);
        }

        merchantRepository.save(merchant);

        return null;
    }

    @Override
    public MerchantInfoSoldDistinct getProductSoldDistinctProduct(int id) {
        return merchantRepository.getProductSoldDistinctProduct(id);
    }


}
