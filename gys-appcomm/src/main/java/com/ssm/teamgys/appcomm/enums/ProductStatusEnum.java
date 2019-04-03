package com.ssm.teamgys.appcomm.enums;

import lombok.Getter;

/**
 * 商品状态
 * Created by zhuzx
 * 2017-05-09 17:33
 */
@Getter
public enum ProductStatusEnum implements CodeEnum {
    UP(1, "在架"),
    DOWN(0, "下架")
    ;

    private Integer code;
    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }


}
