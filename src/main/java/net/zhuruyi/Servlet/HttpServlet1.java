package net.zhuruyi.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author :zhuruyi
 * @Description:使用注解的方式实现servlet
 * @Date:Create in 22:03 2017/9/14
 * @Modified By:
 */
@WebServlet("/sakuar")
public class HttpServlet1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        System.out.println(">>>do get<<<");
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        System.out.println(">>>do post<<<");
        PrintWriter out = resp.getWriter();
        out.println("hello spring boot2");
        out.close();
    }
}
