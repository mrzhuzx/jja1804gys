package com.ssm.teamgys.repositorydomain;

import com.ssm.teamgys.domain.SmbmsAddress;
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
public interface SmbmsAddressRepository extends JpaRepository<SmbmsAddress,Long> {

    @Transactional
    @Modifying(clearAutomatically = true)
    @Query("update SmbmsAddress set addContact=?2 where addId=?1")
    Integer updateById(Long addId, String addContact);

    @Transactional
    @Modifying(clearAutomatically = true)
    @Query("update SmbmsAddress set addContact=?2,addDesc=?3,addPostCode=?4,addTelPhone=?5,modifyDate=?6 where addId=?1")
    Integer updateAddById(Long addId, String addContact, String addDesc, String addPostCode, String addTelPhone, Date modifyDate);
//    private Long addId;
//    private String addContact; //联系人
//    private String addDesc;//地址描述
//    private String addPostCode;//邮递
//    private String addTelPhone;//电话
//    @CreatedDate
//    private Date creationDate;//创建时间
//    @LastModifiedDate
//    private Date modifyDate;//修改时间
}
