package com.ssm.teamgys.domain;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

/**
 * 鑫杰、佳毅
 */
@Data
@Entity
@Table
@EntityListeners(AuditingEntityListener.class)
public class SmbmsAddress {
  @Id //这是一个主键
  @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
  private Long addId;
  private String addContact; //联系人
  private String addDesc;//地址描述
  private String addPostCode;//邮递
  private String addTelPhone;//电话
  @CreatedDate
  private Date creationDate;//创建时间
  @LastModifiedDate
  private Date modifyDate;//修改时间




}
