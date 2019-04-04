package com.ssm.teamgys.controller; /*
 *desc:
 *author:程序猿大佬阿松
 *time:2019/3/27 0027
 *version:1.2.3
 */

import com.ssm.teamgys.domain.SmbmsUser;
import com.ssm.teamgys.service.SmbmsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
@RequestMapping("/smuser")
public class SmbmsUserController {

    @Autowired
    SmbmsUserService smbmsUserService;

    /**
     * 查询全部数据
      * @return
     */
    @RequestMapping("/list")
    public ModelAndView list(){
        ModelAndView m=new ModelAndView("jsp/smbmsuser/smbmsUser");
        List<SmbmsUser> smbmsUserList=smbmsUserService.findAll();
        m.addObject("smbmsUserList",smbmsUserList);
        return m;

    }
    /**
     * 添加
     */
    @RequestMapping("/save")
    public ModelAndView adduser(@ModelAttribute SmbmsUser su) {
        SmbmsUser save = smbmsUserService.save(su);
        ModelAndView m=new ModelAndView("jsp/smbmsuser/smbmsUser");
        List<SmbmsUser> smbmsUserList=smbmsUserService.findAll();
        m.addObject("smbmsUserList",smbmsUserList);
        return m;
    }
    /**
     * 根据ID删除一条数据
     */
    @RequestMapping("/delete")
    public ModelAndView userdelete(@RequestParam String userId){
        ModelAndView m =new ModelAndView("jsp/smbmsuser/smbmsUser");
        smbmsUserService.deleteById(userId);
        List<SmbmsUser> userlist = smbmsUserService.findAll();
        m.addObject("userlist",userlist);
        return m;
    }
    /**
     * 根据ID修改数据
     */
    @RequestMapping("/update")
    public ModelAndView userupdate(@RequestParam Long userId,@RequestParam String userCode,@RequestParam String userName,@RequestParam String userPassword,@RequestParam String userPhone,@RequestParam Long roleId){
       smbmsUserService.update(userCode,userName,userPassword,userPhone,roleId);

        ModelAndView m = new ModelAndView("jsp/smbmsuser/smbmsUser");
        System.out.println("111111"+smbmsUserService.toString());

        List<SmbmsUser> userlist = smbmsUserService.findAll();
        m.addObject("userlist",userlist);
        return m;

    }

    /**
     * 查询一个用户
     * @param userId
     * @return
     */
    @RequestMapping("/queryOne")
    public ModelAndView queryOne(@RequestParam String userId){
        ModelAndView m =new ModelAndView("jsp/smbmsuser/userupdate");
        SmbmsUser user=smbmsUserService.getOne(userId);
        m.addObject("user",user);
        return m;

    }

}
