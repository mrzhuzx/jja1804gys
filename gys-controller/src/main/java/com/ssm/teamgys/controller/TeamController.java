package com.ssm.teamgys.controller;

import com.ssm.teamgys.domain.Team;
import com.ssm.teamgys.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * desc:
 * author:czf
 * time:2019\3\27 0027
 * version:
 */
@Controller
@RequestMapping("/team")
public class TeamController {

    @Autowired
    TeamService teamService;

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public ModelAndView teamDelete(@RequestParam  String  teamId){
        ModelAndView m = new ModelAndView("jsp/team/team");
        teamService.deleteById(teamId);
        List<Team> teamList = teamService.findAll();
        m.addObject("teamList",teamList);
        return m;
    }



    /**
     * 用户添加
     * @param team
     * @return
     */
    @RequestMapping("/save")
    public ModelAndView teamSave(@ModelAttribute Team team){
        teamService.save(team);
        ModelAndView m = new ModelAndView("jsp/team/team");
        List<Team> teamList = teamService.findAll();
        m.addObject("teamList",teamList);
        return m;
    }
/**
 * 用户查找
 */
    @RequestMapping("/list")
    public ModelAndView list(){
        ModelAndView m = new ModelAndView("jsp/team/team");
        List<Team> teamList = teamService.findAll();
        m.addObject("teamList",teamList);
        return m;
    }
    @RequestMapping("/update")
    public ModelAndView teamUpdate(@RequestParam Long teamId,@RequestParam String teamName,@RequestParam String teamSlogen,@RequestParam String teamIcon,@RequestParam String teamState,@RequestParam String teamDesc){
        System.out.println("进来了update");
        teamService.update(teamId,teamName,teamSlogen,teamIcon,teamState,teamDesc);
        ModelAndView m = new ModelAndView("jsp/team/team");
        List<Team> teamList = teamService.findAll();
        m.addObject("teamList",teamList);
        return m;
    }
    @RequestMapping ("queryone")
    public ModelAndView queryOne(@RequestParam Long teamId){
        System.out.println("进来了queryone");
        ModelAndView m = new ModelAndView("jsp/team/teamupdate");
        Team one = teamService.getOne(String.valueOf(teamId));
        System.out.println(one);
        m.addObject("tm",one);
        return m;
    }
    @RequestMapping("findpage")
    public ModelAndView findPage(@RequestParam(required = false)Integer pagenum){
        ModelAndView m = new ModelAndView("jsp/team/team");
        if(pagenum == null || pagenum<=0){
            pagenum = 1;
        }
        Integer size = 3;
        Pageable pageable = new PageRequest(pagenum-1,size,new Sort(Sort.Direction.ASC,"teamId"));
        Page<Team> teamPage = teamService.findAll(pageable);
        m.addObject("teamList", teamPage.getContent());
        m.addObject("pagenum",pagenum);
        return m;
    }





}
