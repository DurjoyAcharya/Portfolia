package com.info.portfolio;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Information", value = "/info")
public class Information {
    private String message;
    private String message1;
    private int number;
    private int i=0;
    public void init()
    {
        message = "I LOVE JAVA!";
        message1="Durjoy Acharya";
        number=1876068550;
        for (int j = 0; j < 10; j++) {
            i+=j;
        }
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body style=\"background-color:powderblue;\">");
        out.println("<h1><center>" + message + "</center></h1>");
        out.println("<br>");
        out.println("<h1><center>" + message1 + "</center></h1>");
        out.println("<br>");
        out.println("<h1><center>My Phone Number is: " +"+880"+number + "</center></h1>");
        out.println("<p>"+i+"</p>");
        out.println("</body></html>");
    }
    public void destroy() {
    }
}
