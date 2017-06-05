package com.coviam.ecommmerchant.dao;

import com.coviam.ecommmerchant.entity.Merchant;
import com.coviam.ecommmerchant.entity.MerchantInfoNameLogoRating;
import com.coviam.ecommmerchant.entity.MerchantInforSoldDistinct;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created by gaurav on 03/06/17.
 */
public interface MerchantRepository extends CrudRepository<Merchant, Long> {

    @Query("select new com.coviam.ecommmerchant.entity.MerchantInfoNameLogoRating( m.name,m.logo,m.rating ) from Merchant m where m.id = :id ")
    MerchantInfoNameLogoRating getMerchantNameLogoRating(@Param("id") Long id);

    @Query("select new com.coviam.ecommmerchant.entity.MerchantInforSoldDistinct( m.productsold,m.distinctproduct ) from Merchant m where m.id = :id ")
    MerchantInforSoldDistinct getProductSoldDistinctProduct(@Param("id") Long id);


}
