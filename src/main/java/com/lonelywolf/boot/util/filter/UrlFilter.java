package com.lonelywolf.boot.util.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
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

            //过滤器初始化
            System.out.println("----------------------->过滤器被创建");

        }

        @Override
        public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
            //设置请求、响应编码格式
            servletRequest.setCharacterEncoding("UTF-8");
            servletResponse.setCharacterEncoding("UTF-8");


            filterChain.doFilter(servletRequest, servletResponse);
        }

        @Override
        public void destroy() {
            //过滤器销毁
            System.out.println("----------------------->过滤器被销毁");
        }
}
