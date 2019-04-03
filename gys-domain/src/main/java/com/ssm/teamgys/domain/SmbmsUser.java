package com.ssm.teamgys.domain;


import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

/**
 *      智鹏/吉松   后台管理员
 */
@Entity
@Table(name="SmbmUser")
@Data
@EntityListeners(AuditingEntityListener.class)
public class SmbmsUser {
  @Id //这是一个主键
  @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键

  private Long userId;
  private String userCode; //会员编码
  private String userName;
  private String userPassword;
  private String userPhone;
  private Long roleId; //角色ID
  @CreatedDate
  private java.sql.Timestamp creationDate; //创建日期
  @LastModifiedDate
  private java.sql.Timestamp modifyDate;//修改日期


}
