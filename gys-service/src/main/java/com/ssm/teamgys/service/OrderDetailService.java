package com.ssm.teamgys.service;


import com.ssm.teamgys.domain.OrderDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Desc:
 * author : teacherzhu
 * 2019/3/23 0023
 */
public interface OrderDetailService {
    OrderDetail findOne(String detailId);

    /**
     * 查询所有在架商品列表
     * @return
     */
    List<OrderDetail> findUpAll();

    Page<OrderDetail> findAll(Pageable pageable);

    OrderDetail save(OrderDetail orderdetail);



    void delete(String detailId);

    void update(OrderDetail orderdetail);



}
