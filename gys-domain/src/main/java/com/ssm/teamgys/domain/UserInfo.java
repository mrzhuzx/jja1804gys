package com.ssm.teamgys.domain;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

/**
 * desc:  表
 * author : 智鹏/吉松
 * time :2019/3/25 0025
 * version: 1.2.3
 */
@Entity
@Table
@Data
@EntityListeners(AuditingEntityListener.class)
public class UserInfo {



    @Id //这是一个主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
    private Long userId;
    private String userCode;
    private String userName;
    private String userPassword;
    private String userPhone;
    private String userAddress;
    @CreatedDate
    private Date creationDate;
    @LastModifiedDate
    private Date modifyDate;


}
