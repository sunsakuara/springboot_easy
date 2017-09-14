package net.zhuruyi.Filter;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * @Author :zhuruyi
 * @Description:这是一个过滤器
 * @Date:Create in 22:15 2017/9/14
 * @Modified By:
 */
@WebFilter
public class HelloFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init Filter");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
            FilterChain filterChain) throws IOException, ServletException {
        //过滤所有请求，判断请求参数中是否包含“key”
        //同时“key==sakuar",如不包含，则认为是非法请求，返回”param error“，如合法继续访问
        System.out.println(">>filter doFilter<<");
        String key = servletRequest.getParameter("key");
        String _key = (String) servletRequest.getServletContext().getAttribute("key");
        if (null != key && _key.equals(key)) {
            System.out.println(">>filter matcher<<");
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            System.out.println(">>fliter param error<<");
            PrintWriter out = servletResponse.getWriter();
            out.println("param error");
            out.close();
        }
    }

    @Override
    public void destroy() {
        System.out.println(">>destory Fiter<<");
    }
}
