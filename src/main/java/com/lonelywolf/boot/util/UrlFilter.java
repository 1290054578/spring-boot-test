package com.lonelywolf.boot.util;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @Author: Xiangyong.zeng
 * @Date: 2019-07-22 18:23
 * @Description:
 */
@WebFilter(filterName = "过滤器",urlPatterns = "/*")
public class UrlFilter implements Filter {

        @Override
        public void init(FilterConfig filterConfig) {
            System.out.println("----------------------->过滤器被创建");
        }

        @Override
        public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

            HttpServletRequest req = (HttpServletRequest) servletRequest;
            String requestURI = req.getRequestURI();
            System.out.println("--------------------->过滤器：请求地址"+requestURI);
            if(!requestURI.contains("info")){
                servletRequest.getRequestDispatcher("/failed").forward(servletRequest, servletResponse);
            }else{
                filterChain.doFilter(servletRequest, servletResponse);
            }
        }

        @Override
        public void destroy() {
            System.out.println("----------------------->过滤器被销毁");
        }
}
