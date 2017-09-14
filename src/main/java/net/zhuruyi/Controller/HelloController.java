package net.zhuruyi.Controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author :zhuruyi
 * @Description:
 * @Date:Create in 20:14 2017/9/14
 * @Modified By:
 */
@Controller
public class HelloController {

    @RequestMapping(value = "/hello")
    @ResponseBody
    public Map<String, String> hello() {
        Map<String, String> hello = new HashMap<String, String>();
        hello.put("date", "hello sakuar");
        hello.put("status", "Success");
        return hello;
    }
}
