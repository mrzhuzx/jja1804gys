package com.ssm.teamgys.repositorydomain;

import com.ssm.teamgys.domain.SmbmsBill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;


public interface SmbmsBillRepository extends JpaRepository<SmbmsBill,Long> {

    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(" update SmbmsBill set billCode=?2,productId=?3,productName=?4,productDesc=?5,productCount=?6,productUnit=?7,totalPrice=?8,isPayment=?9,providerId=?10,proImg=?11,addressId=?12 where billId=?1")
    int  update(Long billId, String billCode, String productId, String productName, String productDesc, Integer productCount, String productUnit, Double totalPrice, Integer isPayment, Long providerId, String proImg, Long addressId);

}
