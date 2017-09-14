package net.zhuruyi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @Author :zhuruyi
 * @Description:这是springboot的启动
 * @Date:Create in 20:10 2017/9/14
 * @Modified By:
 */

//开启servlet扫描，当使用注解的方式的时候使用 @ServletComponentScan
@ServletComponentScan
//springboot声明=
@SpringBootApplication
public class Start {

    public static void main(String[] args) {
        SpringApplication.run(Start.class, args);
    }

    //使用代码的方式，通过注册servlet方式，实现注册到springboot
    /*@Bean
    public ServletRegistrationBean servletRegistrationBean() {
        return new ServletRegistrationBean(new HttpServlet(), "/sakuar");
    }*/

}
