package com.ssm.teamgys.service;


import com.ssm.teamgys.domain.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 商品
 * Created by  zhs
 * 2019-03-26  15:05:43
 */
public interface ProductInfoService{



    ProductInfo findOne(String productId);

    /**
     * 查询所有在架商品列表
     * @return
     */
    List<ProductInfo> findUpAll();

    void delete(String productId);
    void  findone(String productId);

    List<ProductInfo> findsearch();
    void   updateone(String productId, Integer productStatus);

    int  update(String productId, String productName, Double productPrice, Integer productStock, String productDescription, String productIcon, Integer productStatus, Integer categoryType);

    Page<ProductInfo> findAll(Pageable pageable);


    ProductInfo save(ProductInfo productInfo);
    ProductInfo saveall(ProductInfo productInfo);

    //加库存
  //  void increaseStock(List<CartDTO> cartDTOList);

    //减库存
 //   void decreaseStock(List<CartDTO> cartDTOList);

    //上架
  //  ProductInfo onSale(String productId);

    //下架
 //   ProductInfo offSale(String productId);
}
