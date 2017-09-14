package net.zhuruyi.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author :zhuruyi
 * @Description:
 * @Date:Create in 21:39 2017/9/14
 * @Modified By:
 */
public class HttpServlet extends javax.servlet.http.HttpServlet {

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
        out.println("hello spring boot");
        out.close();
    }
}
