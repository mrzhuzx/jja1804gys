package com.ssm.teamgys.domain;

import lombok.Data;

import javax.persistence.*;

/**
 *华铭、泽锋
 */

@Entity
@Table
@Data
public class Member {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
  private long mId;
  /*** 员工工号*/private String mNumber;
  private String mName;
  /**一寸照片*/private String mFaceImg;
  private String mJob; //职位
  /**
   * 开发人员等级
   */
  private  String mGrade;
  /**技能*/
  private String mSkill;
  /**
   * 状态
   */
  private String mStatus;

  private long mItemId;  //团队


}
