package com.ssm.teamgys.controller;

import com.ssm.teamgys.domain.ProductCategory;
import com.ssm.teamgys.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * desc:
 * author : tzhu
 * time :2019/3/27 0027
 * version: 1.2.3
 */
@Controller
@RequestMapping("/protype")
public class ProductCategoryController {

    @Autowired
    ProductCategoryService productCategoryService;


    @RequestMapping("/list")
    public ModelAndView list(){

        ModelAndView m=new ModelAndView("jsp/productCategory");
        List<ProductCategory> productCategoryList = productCategoryService.findAll();
        m.addObject("productCategoryList",productCategoryList);

        return m;


    }
    @RequestMapping("/delete")
    public ModelAndView delete(@RequestParam String categoryId, HttpServletResponse response)throws IOException {
        ModelAndView m=new ModelAndView("jsp/productCategory");

        System.out.println(categoryId);
        System.out.println("——————-----————————");


      productCategoryService.deleteById(categoryId);

        response.setContentType("text/html;charset=utf-8");
       //PrintWriter out = response.getWriter();
       //out.print("<script>alert('您还没有登录，请登录...'); window.location='userlogin.html' </script>");
       //out.flush();
       //out.close();
        List<ProductCategory> productCategoryList = productCategoryService.findAll();
       m.addObject("productCategoryList", productCategoryList);
       return m;

    }
    @RequestMapping("/update")


    public ModelAndView updatea(@RequestParam String categoryId)throws IOException {
        ModelAndView m=new ModelAndView("jsp/form");
        ProductCategory productCategory = productCategoryService.findbyid(categoryId);

        m.addObject("productCategory", productCategory);
        return m;
    }


    @RequestMapping("/update1")
    public ModelAndView update(@RequestParam String categoryId,@RequestParam String categoryName, @RequestParam Integer categoryType) {


        System.out.println("---------------------------------------------");
        System.out.println(categoryId);
        System.out.println(categoryName);
        System.out.println(categoryType);


       int a= productCategoryService.update( categoryId,categoryName,categoryType);

        System.out.println(a);
        ModelAndView m=new ModelAndView("jsp/productCategory");
        List<ProductCategory> productCategoryList = productCategoryService.findAll();
        m.addObject("productCategoryList",productCategoryList);
        return m;

    }



    @RequestMapping("/type")
    public ModelAndView type(){

        ModelAndView m=new ModelAndView("jsp/form");
        List<ProductCategory> productCategoryList = productCategoryService.findAll();
        m.addObject("productCategoryList",productCategoryList);

        return m;


    }
    @RequestMapping("/add")
    public ModelAndView add(@ModelAttribute ProductCategory pro){

        productCategoryService.save(pro);
        ModelAndView m=new ModelAndView("jsp/productCategory");
        List<ProductCategory> productCategoryList = productCategoryService.findAll();
        m.addObject("productCategoryList",productCategoryList);
        return m;

    }

}
