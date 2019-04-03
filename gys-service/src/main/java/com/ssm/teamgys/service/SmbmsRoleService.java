package com.ssm.teamgys.service;

import com.ssm.teamgys.domain.SmbmsRole;

/**
 * desc:
 * author:lzp
 * {time}
 * version:1.2.3
 */
public interface SmbmsRoleService  {

    int update(Long roleId, String roleName, String roleDesc, Integer roleStatus, String roleCode);
}
