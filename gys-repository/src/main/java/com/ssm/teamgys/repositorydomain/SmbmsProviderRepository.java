package com.ssm.teamgys.repositorydomain;

import com.ssm.teamgys.domain.SmbmsProvider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Date;

/**
 * time：2019/3/25--15:59
 * Author:lanxj
 * desc:
 * version:1.3.22
 */
@Repository
public interface SmbmsProviderRepository extends JpaRepository<SmbmsProvider,Long> {


    @Transactional
    @Modifying(clearAutomatically = true)
    @Query("update SmbmsProvider set proName=?2 where proId=?1")
    Integer updateById(Long proId, String proName);

    @Transactional
    @Modifying(clearAutomatically = true)
    @Query("update SmbmsProvider set proCode=?2,proName=?3,proDesc=?4,proContact=?5,proPhone=?6,proAddress=?7,proFax=?8,modifyDate=?9 where proId=?1")
    Integer updateProById(Long proId, String proCode, String proName, String proDesc, String proContact, String proPhone, String proAddress, String proFax, Date modifyDate);

//    private Long proId;
//    private String proCode;//产品编码
//    private String proName;//产品名字
//    private String proDesc;//产品描述
//    /**
//     * 联系
//     */
//    private String proContact;//联系
//    private String proPhone;//电话
//    private String proAddress;//地址
//    /**
//     * 传真
//     */
//    private String proFax;//传真
//    @CreatedDate
//    private Date creationDate;//创建时间
//    @LastModifiedDate
//    private Date modifyDate;
}
