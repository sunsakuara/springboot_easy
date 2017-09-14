package net.zhuruyi.Listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @Author :zhuruyi
 * @Description:
 * @Date:Create in 23:32 2017/9/14
 * @Modified By:
 */
@WebListener
public class HttpServletListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println(">>context Lisner init<<");
        //实现功能：系统启动的时候，加载请求参数配置”key==sakuar“，并在过滤器中进行合法参数验证
        servletContextEvent.getServletContext().setAttribute("key", "sakuar");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println(">>context Lisner destory<<");
    }
}
