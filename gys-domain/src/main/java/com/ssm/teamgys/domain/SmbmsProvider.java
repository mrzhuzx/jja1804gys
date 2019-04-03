package com.ssm.teamgys.domain;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

/**
 *   鑫杰、佳毅 供应商信息
 *
 * */
@Data
@Entity
@Table
@EntityListeners(AuditingEntityListener.class)
public class SmbmsProvider {
  @Id //这是一个主键
  @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
  private Long proId;
  private String proCode;//产品编码
  private String proName;//产品名字
  private String proDesc;//产品描述
  /**
   * 联系
   */
  private String proContact;//联系
  private String proPhone;//电话
  private String proAddress;//地址
  /**
   * 传真
   */
  private String proFax;//传真
  @CreatedDate
  private Date creationDate;//创建时间
  @LastModifiedDate
  private Date modifyDate;//修改时间


}
