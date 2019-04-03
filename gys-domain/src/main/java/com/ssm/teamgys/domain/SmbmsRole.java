package com.ssm.teamgys.domain;


import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

/**
 *  智鹏/吉松
 */
@EntityListeners(AuditingEntityListener.class)
@Entity
@Table
@Data
public class SmbmsRole {
  @Id //这是一个主键
  @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
  private Long roleId;
  /**
   * 编号
   */
  private String roleCode;
  /**
   * 角色名字
   */
  private String roleName;
  /**
   * 角色描述
   */
  private String roleDesc;
  /**
   * 角色状态
   */
  private Integer roleStatus;
  @CreatedDate
  private Date creationDate;
  @LastModifiedDate
  private Date modifyDate;


}
