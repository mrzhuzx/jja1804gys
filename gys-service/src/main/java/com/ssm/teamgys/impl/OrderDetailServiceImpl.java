package com.ssm.teamgys.impl;


import com.ssm.teamgys.domain.OrderDetail;
import com.ssm.teamgys.repositorydomain.OrderDetailRepository;
import com.ssm.teamgys.service.OrderDetailService;
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
public class OrderDetailServiceImpl implements OrderDetailService {

    //注入数据层
    @Autowired
    OrderDetailRepository OrderDetailRepository;  //产品数据层

    @Override
    public OrderDetail findOne(String detailId) {
        return OrderDetailRepository.getOne(detailId);
    }

    /**
     * 查询所有在架商品列表
     *
     * @return
     */
    @Override
    public List<OrderDetail> findUpAll() {
        return OrderDetailRepository.findAll();
    }

    @Override
    public Page<OrderDetail> findAll(Pageable pageable) {
        return OrderDetailRepository.findAll(pageable);
    }

    @Override
    public OrderDetail save(OrderDetail orderdetail) {
        return OrderDetailRepository.save(orderdetail);
    }

    @Override
    public void delete(String detailId) {
             OrderDetailRepository.deleteById(detailId);
    }

    @Override
    public void update(OrderDetail orderdetail) {
        OrderDetailRepository.save(orderdetail);
    }


}
