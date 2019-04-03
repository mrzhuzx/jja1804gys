package com.ssm.teamgys.service;

import com.ssm.teamgys.appcomm.BaseService;
import com.ssm.teamgys.domain.SmbmsAddress;

import java.util.Date;

/**
 * time：2019/3/25--15:47
 * Author:lanxj
 * desc:
 * version:1.3.22
 */

public interface SmbmsAddressService extends BaseService<SmbmsAddress> {

    Integer updateById(Long addId, String addContact);
    Integer updateAddById(Long addId, String addContact, String addDesc, String addPostCode, String addTelPhone, Date modifyDate);
}
