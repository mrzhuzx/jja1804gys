package com.ssm.teamgys.repositorydomain;

import com.ssm.teamgys.domain.SmbmsUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface SmbmsUserRepository extends JpaRepository<SmbmsUser, Long> {



    @Transactional
    @Modifying(clearAutomatically = true)
    @Query("update SmbmsUser set  userCode=?1,userName=?2,userPassword=?3,userPhone=?4 where userId=?5 ")
    int update(String userCode, String userName, String userPassword, String userPhone, Long userId);



}
