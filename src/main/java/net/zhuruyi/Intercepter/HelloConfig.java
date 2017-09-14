package net.zhuruyi.Intercepter;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Author :zhuruyi
 * @Description:
 * @Date:Create in 23:56 2017/9/14
 * @Modified By:
 */
@Configuration
public class HelloConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new HelloIntercepter()).addPathPatterns("/**");
    }
}
