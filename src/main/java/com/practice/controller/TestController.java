package com.practice.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @description: <文件描述>
 * @modified: <文件修改说明>
 * @auther: ZhuoZhiling
 * @date: 2018/9/4 9:41
 * @version: 2.0.0
 */
public class TestController extends HttpServlet{

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter writer = response.getWriter();
        String vegetable = request.getParameter("vegetable");
        String reason = request.getParameter("reason");
        if (vegetable == null) {
            vegetable = "Tomato";
        }

        if (reason == null) {
            reason = "sweet";
        }
        writer.println("<html><body>");
        writer.println("<h1> Q:What do you like best? </h1>");
        writer.println("<h1> A:" + vegetable + "</h1>");
        writer.println("<h1> Q: Why ?</h1>");
        writer.println("<h1> A: cause it's" + reason + "</h1>");
        writer.println("</body></html>");
    }
}
