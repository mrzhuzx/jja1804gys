package com.ssm.teamgys.repositorydomain;

import com.ssm.teamgys.domain.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Desc:
 * author : teacherzhu
 * 2019/3/23 0023
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail,String> {
  

}
