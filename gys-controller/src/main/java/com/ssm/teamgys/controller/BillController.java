package com.ssm.teamgys.controller;

import com.ssm.teamgys.domain.SmbmsBill;
import com.ssm.teamgys.service.SmbmsBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/bill")
public class BillController {

    @Autowired
    SmbmsBillService smbmsBillService;



    @RequestMapping("/listquery")//带分页查询
    public ModelAndView listquery(@RequestParam(required = false) Integer pagenum){
        ModelAndView m=new ModelAndView("jsp/bill/billOperation");

        long count = smbmsBillService.count();
        Integer intcount=(int)count;
        Integer size=8;
        Integer pageAll=intcount%size==0?intcount/size:intcount/size+1;
        if (pagenum==null||pagenum<=0){
            pagenum=1;
        }
        if (pagenum>=pageAll){
            pagenum=pageAll;
        }

        PageRequest billId = new PageRequest(pagenum - 1, size, new Sort(Sort.Direction.DESC, "billId"));
        Page<SmbmsBill> bills = smbmsBillService.findAll(billId);
        m.addObject("pageAll",pageAll);
        m.addObject("pagenum",pagenum);
        m.addObject("billList",bills.getContent());
        return m;
    }

    @RequestMapping("/delete")//删除
    public ModelAndView billDelete(@RequestParam Long strId){
        ModelAndView m=new ModelAndView("jsp/bill/billOperation");
        smbmsBillService.deleteById(String.valueOf(strId));
        List<SmbmsBill> billList=smbmsBillService.findAll();
        m.addObject("billList",billList);
        return m;

    }
    @RequestMapping("/save")//增加
    public ModelAndView billSave(@ModelAttribute SmbmsBill smbmsBill){

        smbmsBillService.save(smbmsBill);
        ModelAndView m=new ModelAndView("jsp/bill/billOperation");
        List<SmbmsBill> billList=smbmsBillService.findAll();
        m.addObject("billList",billList);
        return m;
    }

    @RequestMapping("/update")//修改
    public  ModelAndView billupdate(@RequestParam Long billId ,@RequestParam String billCode,@RequestParam String productId,@RequestParam String productName,@RequestParam String productDesc,@RequestParam Integer productCount,@RequestParam String productUnit,@RequestParam Double totalPrice,@RequestParam Integer isPayment,@RequestParam Long providerId,@RequestParam String proImg,@RequestParam Long addressId){
        System.out.println(isPayment+"3333333333333####################");
        smbmsBillService.update(billId,billCode,productId,productName,productDesc,productCount,productUnit,totalPrice,isPayment,providerId,proImg,addressId);
        ModelAndView m=new ModelAndView("jsp/bill/billOperation");
        System.out.println("11111111"+smbmsBillService.toString());
        List<SmbmsBill> billList=smbmsBillService.findAll();
        m.addObject("billList",billList);
        return m;
    }
    @RequestMapping("/queryOne")//查询一条
    public ModelAndView queryOne(@RequestParam Long billId ){
        ModelAndView m=new ModelAndView("jsp/bill/billupdate");
        SmbmsBill bill=smbmsBillService.getOne(String.valueOf(billId));
        m.addObject("bl",bill);
        return m;

    }
    @RequestMapping("/queryT")//查询一条
    public ModelAndView queryT(@RequestParam Long billId ){
        ModelAndView m=new ModelAndView("jsp/bill/billCX");
        SmbmsBill bill=smbmsBillService.getOne(String.valueOf(billId));
        m.addObject("bl",bill);
        return m;

    }



}
