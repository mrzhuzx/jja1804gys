package com.ssm.teamgys.service;

import com.ssm.teamgys.appcomm.BaseService;
import com.ssm.teamgys.domain.SmbmsBill;


public interface SmbmsBillService extends BaseService<SmbmsBill> {
    int update(Long billId, String billCode, String productId, String productName, String productDesc, Integer productCount, String productUnit, Double totalPrice, Integer isPayment, Long providerId, String proImg, Long addressId);
}
