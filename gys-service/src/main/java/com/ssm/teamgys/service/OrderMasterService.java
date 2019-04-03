package com.ssm.teamgys.service;

import com.ssm.teamgys.domain.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Desc:
 * author : teacherzhu
 * 2019/3/23 0023
 */
public interface OrderMasterService {
    OrderMaster findOne(String detailId);

    /**
     * 查询所有在架商品列表
     * @return
     */
    List<OrderMaster> findUpAll();

    Page<OrderMaster> findAll(Pageable pageable);

    OrderMaster save(OrderMaster ordermaster);


}
