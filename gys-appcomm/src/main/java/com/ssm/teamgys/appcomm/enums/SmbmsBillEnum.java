package com.ssm.teamgys.appcomm.enums;

import lombok.Getter;

/**
 * desc:
 * author : tzhu
 * time :2019/3/26 0026
 * version: 1.2.3
 * ctrl+shift+U
 */
@Getter
public enum SmbmsBillEnum {

    ISPAY_WAIT(1,"等待支付"),
    ISPAY_SUCCESS(2,"支付成功"),
    ISPAY_ERROR(3,"支付失败")

    ;

  private   Integer code;
  private  String desc;

    SmbmsBillEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }



}

