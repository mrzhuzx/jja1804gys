package com.ssm.teamgys.appcomm;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;


/**
 * desc:java后台设置可跨域访问，前端ajax获取json数据，解决浏览器限制跨域访问的问题
 * author : tzhu
 * time :2019/4/3 0003
 * version: 1.2.3
 */
@WebFilter(filterName = "HeaderFilter",urlPatterns ={"/*"})//
@Configuration  //注意要写上
public class HeaderFilter implements Filter {
    public void doFilter(ServletRequest request, ServletResponse resp, FilterChain chain) throws IOException, ServletException
    {
        System.out.println(" 跨域访问 执行.......................... ");
        HttpServletResponse response = (HttpServletResponse) resp; response.setHeader("Access-Control-Allow-Origin", "*"); //解决跨域访问报错
        response.setHeader("Access-Control-Allow-Methods", "POST, PUT, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600"); //设置过期时间
        response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept, client_id, uuid, Authorization");
        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // 支持HTTP 1.1.
        response.setHeader("Pragma", "no-cache"); // 支持HTTP 1.0. response.setHeader("Expires", "0");
        chain.doFilter(request, resp);
    }
    public void init(FilterConfig filterConfig) {
       // System.out.println(" 跨域访问 init()......................................................");
    }
    public void destroy() {}
}
