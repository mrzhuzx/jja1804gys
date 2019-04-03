package com.ssm.teamgys.domain;


import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

/**
 *     队长
 * 广告表
 */
@Entity
@Table
@Data
public class Guanggao {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long ggId;
  private String ggTitle; //主题
  private String ggImg;//图片
  private String ggUrl;//链接

  @CreatedDate
  private Date createTime;
  /** 修改时间 */
  @LastModifiedDate
  private Date updateTime;



}
