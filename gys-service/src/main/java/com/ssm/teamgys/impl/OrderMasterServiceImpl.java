package com.ssm.teamgys.impl;


import com.ssm.teamgys.domain.OrderMaster;
import com.ssm.teamgys.repositorydomain.OrderMasterRepository;
import com.ssm.teamgys.service.OrderMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * desc:
 * author : tzhu
 * time :2019/3/25 0025
 * version: 1.2.3
 */
@Service
public class OrderMasterServiceImpl implements OrderMasterService {

    //注入数据层
    @Autowired
    OrderMasterRepository OrderMasterRepository;  //产品数据层

    @Override
    public OrderMaster findOne(String productId) {
        return OrderMasterRepository.getOne(productId);
    }

    /**
     * 查询所有在架商品列表
     *
     * @return
     */
    @Override
    public List<OrderMaster> findUpAll() {
        return OrderMasterRepository.findAll();
    }

    @Override
    public Page<OrderMaster> findAll(Pageable pageable) {
        return OrderMasterRepository.findAll(pageable);
    }

    @Override
    public OrderMaster save(OrderMaster ordermaster) {
        return OrderMasterRepository.save(ordermaster);
    }


}
