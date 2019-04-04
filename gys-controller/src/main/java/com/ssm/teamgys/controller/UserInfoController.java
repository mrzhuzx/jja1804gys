package com.ssm.teamgys.controller;

import com.ssm.teamgys.domain.UserInfo;
import com.ssm.teamgys.service.UserInfoService;
import lombok.extern.log4j.Log4j2;
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
 * author:卢智鹏
 * {time}
 * version:1.2.3
 */
@Log4j2
@Controller
@RequestMapping("/userinfo")
public class UserInfoController {

    @Autowired
    UserInfoService userInfoService;

    /**
     * 查询全部
     * @return
     */
    @RequestMapping("/list")
    public ModelAndView list(){
        ModelAndView u = new ModelAndView("jsp/userinfo/userinfo");
        List<UserInfo> userInfoList=userInfoService.findAll();
        u.addObject("userInfoList",userInfoList);
        return u;
    }

    /**
     * 分页查询
     */
    @RequestMapping("/pagelist")
    public ModelAndView page(@RequestParam(required = false) Integer pagenum ){
        ModelAndView m = new ModelAndView("jsp/userinfo/userinfo");
        long count = userInfoService.count();
        Integer ui=(int)count;
        Integer size=10;
        Integer pageall=ui%size==0?ui/size:ui/size+1;
        if(pagenum ==null ||pagenum<=0){
            pagenum=1;
        }
        if(pagenum>=pageall){
            pagenum=pageall;
        }

        Pageable pageable=new PageRequest(pagenum-1,size,new Sort(Sort.Direction.ASC,"userId"));
        Page<UserInfo> pagelist=userInfoService.findAll(pageable);
        m.addObject("pagenum",pagenum);
        m.addObject("pageall",pageall);
        m.addObject("userInfoList",pagelist.getContent());
        return  m;

    }

    /**
     * 根据主键ID删除
     * @param userId
     * @return
     */
    @RequestMapping("/userdel")
    public ModelAndView  userinfodelete(@RequestParam Long userId){
       ModelAndView a=new ModelAndView("jsp/userinfo/userinfo");
       userInfoService.deleteById(String.valueOf(userId));
       List<UserInfo> userInfoList=userInfoService.findAll();
       a.addObject("userInfoList",userInfoList);
       return a;
    }


    /**
     * 增加一条数据
     * @param ui
     * @return
     */

    @RequestMapping("/save")
    public ModelAndView usersave(@ModelAttribute UserInfo ui) {

        ModelAndView u = new ModelAndView("jsp/userinfo/userinfo");
        UserInfo save = userInfoService.save(ui);
        if (save != null) {
            List<UserInfo> userInfoList=userInfoService.findAll();
            u.addObject("userInfoList",userInfoList);
            return u;
        } else {
            log.info("添加失败");
            List<UserInfo> userInfoList=userInfoService.findAll();
            u.addObject("userInfoList",userInfoList);
            return u;
        }
    }


    /**
     * 查询一条数据
     * @param userId
     * @return
     */

    @RequestMapping("/searchone")
    public ModelAndView userUpdate(@RequestParam String userId){
        ModelAndView u=new ModelAndView("jsp/userinfo/userupdate");
        UserInfo search=userInfoService.getOne(userId);
        u.addObject("search",search);
        return u;

    }

    /**
     * 修改查询到的数据
     * @param user
     * @return
     */

    @RequestMapping("/update")
    public ModelAndView userupdate(@ModelAttribute UserInfo user) {
        userInfoService.update(user.getUserId(),user.getUserPassword(),user.getUserAddress(),user.getUserPhone(),user.getUserName(),user.getUserCode());
        ModelAndView u=new ModelAndView("jsp/userinfo/userinfo");
        List<UserInfo> userInfoList=userInfoService.findAll();
        u.addObject("userInfoList",userInfoList);
        return u;
        }

}
