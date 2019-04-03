package com.ssm.teamgys.service;

import com.ssm.teamgys.appcomm.BaseService;
import com.ssm.teamgys.domain.UserInfo;

/**
 * desc:
 * author:lzp
 * {time}
 * version:1.2.3
 */

public interface UserInfoService extends BaseService<UserInfo>{

    int update(Long userId, String userPassword, String userAddress, String userPhone, String userName, String userCode);



}
