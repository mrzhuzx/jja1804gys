package com.ssm.teamgys.controller;

import com.ssm.teamgys.domain.Guanggao;
import com.ssm.teamgys.service.GuanggaoService;
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
 * author :you
 * time: 2019年3月27日 15:59:29
 */
@Controller
@RequestMapping("/advert")
public class GuanggaoController {
    @Autowired
    GuanggaoService guanggaoService;

    /**
     * 查询全部数据
     * @return
     */

    @RequestMapping("/list")
    public ModelAndView list(){
        ModelAndView m=new ModelAndView("jsp/advert/advert");
        List<Guanggao> guanggaoList = guanggaoService.findAll();
        m.addObject("advertList",guanggaoList);
        return m;
    }
    /**
     * 查询全部Provider带分页
     * @return
     */
    @RequestMapping("/listByPage")
    public ModelAndView listByPage(@RequestParam(required = false) Integer pagenum){
        ModelAndView m=new ModelAndView("jsp/advert/advert");
        if (pagenum==null||pagenum<=0){
            pagenum=1;
        }
        Integer size=3;
        Pageable pageable =new PageRequest(pagenum-1,size,new Sort(Sort.Direction.ASC,"ggId"));
        Page<Guanggao> guanggaoList = guanggaoService.findAll(pageable);
        m.addObject("advertList",guanggaoList.getContent());
        m.addObject("pagenum",pagenum);
        return m;
    }

    /**
     * 有
     * 根据ID删除一条数据
     * @param inId
     * @return
     */

@RequestMapping("/delete")
    public  ModelAndView advertDelete(@RequestParam Long inId){
       ModelAndView m=new ModelAndView("jsp/advert/advert") ;
      guanggaoService.deleteById(String.valueOf(inId));
      List<Guanggao>advertList=guanggaoService.findAll();
      m.addObject("advertList",advertList);
        return m;
}

    /**9
     * 添加
     * @param guanggao
     * @return
     */
    @RequestMapping("/seve")
    public ModelAndView advertSave(@ModelAttribute Guanggao guanggao){
        guanggaoService.save(guanggao);

    ModelAndView m=new ModelAndView("jsp/advert/advert") ;

    List<Guanggao>advertList=guanggaoService.findAll();

    m.addObject("advertList",advertList);

        return m;
}

    /**
     * 修改
     * @param ggId
     * @param ggTitle
     * @param ggImg
     * @param ggUrl
     * @return
     */
    @RequestMapping("/update")
public  ModelAndView advertupdate(@RequestParam Long ggId,@RequestParam  String ggTitle,@RequestParam String ggImg, @RequestParam String ggUrl){
        guanggaoService.update(ggId,ggTitle,ggImg,ggUrl);
    ModelAndView m=new ModelAndView("jsp/advert/advert") ;
    System.out.println("111"+guanggaoService.toString());
    List<Guanggao>advertList=guanggaoService.findAll();
    m.addObject("advertList",advertList);
    return m;
}

    }




