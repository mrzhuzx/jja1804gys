package com.ssm.teamgys.controller;


import com.ssm.teamgys.appcomm.MYUUID;
import com.ssm.teamgys.domain.ProductInfo;
import com.ssm.teamgys.repositorydomain.ProductCategoryRepository;
import com.ssm.teamgys.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * desc:
 * author:zhs
 * time:2019-03-27  18:38:31
 */

@Controller
@RequestMapping("/product")
public class ProductInfoController {

    @Autowired
    ProductInfoService productInfoService;
    ProductCategoryRepository productCategoryRepository;


    @RequestMapping("/pro")
    public ModelAndView list() {

        ModelAndView m = new ModelAndView("jsp/product/product");
        List<ProductInfo> findsearch = productInfoService.findsearch();
        m.addObject("findsearch", findsearch);


        return m;

    }
    @RequestMapping("delete")
    public ModelAndView   delete(@RequestParam  String   productId){

        ModelAndView  m  = new ModelAndView("jsp/product/product");

        productInfoService.delete(productId);
        List<ProductInfo> findsearch = productInfoService.findsearch();
        m.addObject("findsearch", findsearch);

        return m;
    }


    @RequestMapping("/save")
    public ModelAndView save(@ModelAttribute ProductInfo pro ){

        pro.setProductId(MYUUID.getYYYYMMDDhhmmss());
        productInfoService.save(pro);
        System.out.println(pro.toString());

        ModelAndView m = new ModelAndView("jsp/product/product");

        List<ProductInfo> findsearch = productInfoService.findsearch();
        m.addObject("findsearch", findsearch);


        return m;

    }


    @RequestMapping(value = "/{proid}/searchone")

    public ModelAndView  searchone(  @PathVariable(value = "proid") String  searchone){
        ProductInfo one = productInfoService.findOne(searchone);
        ModelAndView  m =   new ModelAndView("jsp/product/productupdate");
        m.addObject("proone",one);


        return m;
    }

    @RequestMapping(value = "/{proid}/updateone")

    public   ModelAndView update(@PathVariable(value ="proid")  String  proid,@ModelAttribute ProductInfo pro){

        ModelAndView  m = new ModelAndView("jsp/product/product");
        int update = productInfoService.update(proid, pro.getProductName(), pro.getProductPrice(), pro.getProductStock(), pro.getProductDescription(), pro.getProductIcon(), pro.getProductStatus(), pro.getCategoryType());


        List<ProductInfo> findsearch = productInfoService.findsearch();
        m.addObject("findsearch", findsearch);

        return  m;


    }

    /**
     * 查询全部Product带分页
     * @return
     * (required = false) 允许为空
     */
    @RequestMapping("productfindPage")//
    public ModelAndView productfindPage(@RequestParam(required = false) Integer pagenum){
        ModelAndView m = new ModelAndView("jsp/product/product");

        if(pagenum ==null ||pagenum<=0){
            pagenum=1;
    }
        Integer size=3;
        Pageable pageable=new PageRequest(pagenum-1,size,new Sort(Sort.Direction.ASC,"productId"));

        Page<ProductInfo> infoPage = productInfoService.findAll(pageable);



        m.addObject("findsearch",infoPage.getContent());
        m.addObject("pagenum",pagenum);

        return m;
    }





}