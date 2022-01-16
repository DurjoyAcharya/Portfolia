package com.info.portfolio;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;
    private String Name;
    private int i;

    public void init()
    {
        message = "I LOVE JAVA!";
        Name="Durjoy Acharya";

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body style=\"background-color:powderblue;\" >");
        out.println("<h1><center>" + message + "</center></h1>");
        out.println("<br>");
        //out.println("<p>"+i+"</p>");
        for (int j = 0; j < 10; j++) {
            out.println("<h2><center>Name: " + Name + "</center></h2>");
        }
        out.println("</body></html>");
    }

    public void destroy() {
    }
}