package com.ssm.teamgys.repositorydomain;

import com.ssm.teamgys.domain.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


/**
 * desc:
 * author:lzp
 * {time}
 * version:1.2.3
 */
@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo,Long> {

    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(" update UserInfo set userPassword=?2 ,userAddress=?3,userPhone=?4,userName=?5,userCode=?6 where userId=?1")
    int update(Long userId, String userPassword, String userAddress, String userPhone, String userName, String userCode);

}
