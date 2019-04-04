package com.ssm.teamgys.controller;

import com.ssm.teamgys.domain.SmbmsAddress;
import com.ssm.teamgys.service.SmbmsAddressService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * time：2019/3/27--15:55
 * Author:蓝鑫杰
 * desc:
 * version:1.3.22
 */
@Controller
@RequestMapping(value = "smbmsAddress")
@Log4j2
public class SmbmsAddressController {
    @Autowired
    SmbmsAddressService smbmsAddressService;

    /**
     * 查询全部Address
     *
     * @return
     */
    @RequestMapping(value = "findAllAddress",method = RequestMethod.GET)
    public String findAllAddress(Model model) {
        List<SmbmsAddress> list = getpage();
        model.addAttribute("addresslist",list);
        log.info("1111111:"+list.toString());
        return "jsp/address/smbmsAddress";
    }

    /**
     * 查询全部带分页
     * @param model
     * @return
     */
    @RequestMapping(value = "findAllAddressByPage",method = RequestMethod.GET)
    public String findAllAddressByPage(@RequestParam(required = false) Integer pagenum, Model model) {
        System.out.println(getpageAll()+"_____________________________________________________");
        log.info("页数:"+pagenum+"################################################");
        if (pagenum==null||pagenum<=0) {
            pagenum=1;
        }

        if (pagenum>=getpageAll()) {
            pagenum=getpageAll();
        }
        Integer pageSize=10;
        Pageable pageable=new PageRequest(pagenum-1,pageSize,new Sort(Sort.Direction.ASC,"addId" ));
        Page<SmbmsAddress> page = smbmsAddressService.findAll(pageable);

        model.addAttribute("addresslist",page.getContent());
        model.addAttribute("pagenum",pagenum);
        model.addAttribute("pageAll",getpageAll());
        log.info("页数:"+pagenum+"数据:"+page.getContent().toString());
        return "jsp/address/smbmsAddress";
    }

    /**
     * 根据ID去修改Address
     *
     * @return
     */
    @RequestMapping(value = "{addId}/updateById",method = RequestMethod.POST)
    public String updateById(@PathVariable(value = "addId")Long addId, @ModelAttribute SmbmsAddress sm, Model model) {
        log.info("--------------"+sm.toString());

        Integer row = smbmsAddressService.updateAddById(sm.getAddId(), sm.getAddContact(), sm.getAddDesc(), sm.getAddPostCode(), sm.getAddTelPhone(), new Date());
        if (row != 0) {
            List<SmbmsAddress> list = getpage();
            model.addAttribute("addresslist",list);
            model.addAttribute("pageAll",getpageAll());

            return "jsp/address/smbmsAddress";
        } else {
            log.info("修改失败！！");
            List<SmbmsAddress> list = getpage();
            model.addAttribute("addresslist",list);
            model.addAttribute("pageAll",getpageAll());
            return "jsp/address/smbmsAddress";
        }


    }
    @RequestMapping("{addId}/findById")
    public String findById(@PathVariable(value = "addId")String addId,Model model){
        SmbmsAddress smbmsAddress = smbmsAddressService.getOne(addId);

        model.addAttribute("sa",smbmsAddress);

        return "jsp/address/editAddress";
    }

    /**
     * 根据ID删除address
     *
     * @return
     */
    @RequestMapping("{addId}/deleteById")
    public String deleteById(@PathVariable(value = "addId") String addId,Model model) {
        smbmsAddressService.deleteById(addId);
        List<SmbmsAddress> list =getpage();
        model.addAttribute("addresslist",list);
        model.addAttribute("pageAll",getpageAll());
        return "jsp/address/smbmsAddress";
    }

    /**
     * 添加一条Address
     *
     * @return
     */
    @RequestMapping(value = "addAddress",method = RequestMethod.POST)
    public String addAddress(@ModelAttribute SmbmsAddress sa, Model model) {

        SmbmsAddress save = smbmsAddressService.save(sa);
        if (save != null) {
            List<SmbmsAddress> list = getpage();
            model.addAttribute("addresslist",list);
            model.addAttribute("pageAll",getpageAll());

            return "jsp/address/smbmsAddress";
        } else {
            log.info("添加失败！！");
            List<SmbmsAddress> list = getpage();
            model.addAttribute("addresslist",list);
            model.addAttribute("pageAll",getpageAll());

            return "jsp/address/smbmsAddress";
        }
    }

    private  List<SmbmsAddress> getpage() {
        Integer pagenum=1;

        Integer pageSize=10;
        Pageable pageable=new PageRequest(pagenum-1,pageSize,new Sort(Sort.Direction.ASC,"addId" ));
        Page<SmbmsAddress> page = smbmsAddressService.findAll(pageable);
        List<SmbmsAddress> list = page.getContent();
        return list;
    }
    private  Integer getpageAll(){
        long count = smbmsAddressService.count();

        Integer intCount= (int)count;
        Integer pageSize=10;
        Integer pageAll=intCount%pageSize==0?intCount/pageSize:intCount/pageSize+1;
        return pageAll;
    }
    //At the time of initialization,convert the type "String" to type "date"
    /**spirngmvc对时间类型支持*/
    @InitBinder
    public void initBinder(ServletRequestDataBinder binder){
        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"), true));
        // binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd "), true));
    }
}