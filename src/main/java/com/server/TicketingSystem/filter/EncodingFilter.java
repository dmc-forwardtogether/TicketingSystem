package com.server.TicketingSystem.filter;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * @author qxq
 * 编码过滤器（用于统一项目编码）
 */
@WebFilter(filterName = "Filter01_encodingFilter",value = "/*")
public class EncodingFilter implements Filter {
    public void init(FilterConfig filterConfig) {

    }
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        // 处理请求乱码
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        // 处理响应乱码
        String url=httpServletRequest.getRequestURI();
        System.out.println("url:" +url);
        if(url.indexOf(".css")>0||url.indexOf(".js")>0||url.indexOf(".png")>0) {
            chain.doFilter(request, httpServletResponse);
            return;
        }
        httpServletResponse.setContentType("text/html;text/html; charset=UTF-8");
        chain.doFilter(httpServletRequest, httpServletResponse);
    }
    public void destroy() {
    }
}
