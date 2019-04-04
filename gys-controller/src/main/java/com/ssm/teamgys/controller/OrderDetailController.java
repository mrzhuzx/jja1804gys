package com.ssm.teamgys.controller;/*
 * desc:
 * author:tanghuaming
 * time:2019\3\28 0028
 */


import com.ssm.teamgys.domain.OrderDetail;
import com.ssm.teamgys.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/order")
public class OrderDetailController {
    @Autowired
    OrderDetailService orderDetailService;


    @RequestMapping("/list")
    public ModelAndView list() {

        ModelAndView mv = new ModelAndView("jsp/orderDetailCategory");
        List<OrderDetail> orderDetailList = orderDetailService.findUpAll();

        mv.addObject("orderDetailList", orderDetailList);


        return mv;
    }

    @RequestMapping("/save")
    public ModelAndView save(OrderDetail orderdetail) {


        ModelAndView mv = new ModelAndView("jsp/orderDetailCategory");
        orderDetailService.save(orderdetail);
        List<OrderDetail> orderDetailList = orderDetailService.findUpAll();
        mv.addObject("orderDetailList", orderDetailList);
        return mv;
    }
    @RequestMapping("del.do")
    public ModelAndView delete(String detailId) {
        ModelAndView mv = new ModelAndView("jsp/orderDetailCategory");
        orderDetailService.delete(detailId);
        List<OrderDetail> orderDetailList = orderDetailService.findUpAll();
        mv.addObject("orderDetailList", orderDetailList);
        return mv;
    }
    @RequestMapping("up.do")
    public ModelAndView update(String detailId) {
        System.out.println(detailId);
        ModelAndView mv = new ModelAndView("jsp/orderDetail-up");

//        List<OrderDetail> orderDetailList = orderDetailService.findUpAll();
//        mv.addObject("orderDetailList", orderDetailList);
        return mv;
    }
}
