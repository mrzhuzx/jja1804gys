package com.ssm.teamgys.service; /*
 *desc:
 *author:wjs
 *time:2019/3/25 0025
 *version:1.2.3
 */


import com.ssm.teamgys.appcomm.BaseService;
import com.ssm.teamgys.domain.SmbmsUser;

public interface SmbmsUserService extends BaseService<SmbmsUser> {
    int update(String userCode, String userName, String userPassword, String userPhone, Long userId);
}
