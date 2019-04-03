package com.ssm.teamgys.service;

import com.ssm.teamgys.appcomm.BaseService;
import com.ssm.teamgys.domain.Team;

/**
 * desc:
 * author:czf
 * time:2019\3\25 0025
 * version:
 */
public interface TeamService extends BaseService<Team> {

    int update(Long teamId, String teamName, String teamSlogen, String teamIcon, String teamState, String teamDesc);

}
