package net.zhuruyi.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author :zhuruyi
 * @Description:生成响应页面
 * @Date:Create in 20:42 2017/9/14
 * @Modified By:
 */
@Controller
public class JSPController {

    @RequestMapping(value = "/jsp/home")
    public String home() {
        return "home";
    }
}
