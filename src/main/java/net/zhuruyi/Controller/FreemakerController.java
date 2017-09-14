package net.zhuruyi.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author :zhuruyi
 * @Description:
 * @Date:Create in 21:25 2017/9/14
 * @Modified By:
 */
@Controller
public class FreemakerController {

    @RequestMapping(value = "/ftl/home")
    public String home() {
        return "home";
    }
}
