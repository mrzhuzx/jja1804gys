package com.ssm.teamgys.domain;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

/**
 * 类目    华生、鑫海
 * Created by zhuzx
 * 2017-05-07 14:30
 */
@Entity
@DynamicUpdate
@Data
@EntityListeners(AuditingEntityListener.class)
public class ProductCategory {

    /** 类目id. */
    @Id //这是一个主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
    private String categoryId;

    /** 类目名字. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;
    /**创建时间.*/
    @CreatedDate
    private Date createTime;
    /** 修改时间 */
    @LastModifiedDate
    private Date updateTime;



}
