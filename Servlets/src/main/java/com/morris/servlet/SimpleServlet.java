package com.morris.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/home")
public class SimpleServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int port = req.getLocalPort();
        resp.getWriter().write("Ray Bradbury's The Illustrated Man");
        resp.getWriter().write("\nLocal Port = " + port);
        showCookies(req, resp);

    }

    public void showCookies(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        for ( Cookie cookie : cookies ) {
            resp.getWriter().write("\n" + cookie.toString());
        }
    }
}
