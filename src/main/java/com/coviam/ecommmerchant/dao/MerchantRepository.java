package com.coviam.ecommmerchant.dao;

import com.coviam.ecommmerchant.entity.Merchant;
import com.coviam.ecommmerchant.entity.MerchantInfoNameLogoRating;
import com.coviam.ecommmerchant.entity.MerchantInfoSoldDistinct;
import com.coviam.ecommmerchant.entity.MerchantInfoSoldDistinctRating;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created by gaurav on 03/06/17.
 */
public interface MerchantRepository extends CrudRepository<Merchant, Integer> {

    @Query("select new com.coviam.ecommmerchant.entity.MerchantInfoNameLogoRating( m.name,m.logo,m.rating ) " +
            "from Merchant m where m.id = :id ")
    MerchantInfoNameLogoRating getMerchantNameLogoRating(@Param("id") int id);

    @Query("select new com.coviam.ecommmerchant.entity.MerchantInfoSoldDistinctRating( m.productsold,m.distinctproduct, m.rating ) " +
            "from Merchant m where m.id = :id ")
    MerchantInfoSoldDistinctRating getProductSoldDistinctProductRating(@Param("id") int id);

    @Query("select new com.coviam.ecommmerchant.entity.MerchantInfoSoldDistinct( m.productsold,m.distinctproduct ) " +
            "from Merchant m where m.id = :id ")
    MerchantInfoSoldDistinct getProductSoldDistinctProduct(@Param("id") int id);

    @Query("select m.name from Merchant m where m.id = :merchantId")
    String getMerchantNameByMerchantid(@Param("merchantId") int merchantId);

}
