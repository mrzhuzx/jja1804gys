package com.ssm.teamgys.repositorydomain;

import com.ssm.teamgys.domain.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

/**
 * desc:
 * author:czf
 * time:2019\3\25 0025
 * version:
 */
public interface TeamRepository extends JpaRepository<Team,Long> {

    /**
     * HQL  对象查询语句  JPA(hibernate [HQL,QBC,SQL])
     *    hibernate : one-to-one  onetomany  manytomone  manytomany
     * @param teamId
     * @param teamName
     * @return
     */
    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(" update Team set teamName=?2,teamSlogen=?3,teamIcon=?4,teamState=?5,teamDesc=?6 where teamId=?1")
    int update(Long teamId, String teamName, String teamSlogen, String teamIcon, String teamState, String teamDesc);
}
