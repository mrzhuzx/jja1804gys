package com.ssm.teamgys.appcomm.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * 商品(包含类目)
 * Created by zhuzx
 * 2017-05-12 14:20
 */
@Data
public class ProductCategoryVO {

    @JsonProperty("categoryType")
    private Integer categoryType;

    @JsonProperty("categoryName")
    private String categoryName;

   // @JsonProperty("productInfoVOList")
  //  private List<com.ssm.teamgys.controller.vo.ProductInfoVO> productInfoVOList;
}
