package ru.geekbrains;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Order", urlPatterns = "/order")
public class Order extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");

        ru.geekbrains.Main.logger.info("New GET request");
        resp.getWriter().printf("<h1>This is a Order page</h1>");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        ru.geekbrains.Main.logger.info("New POST request");
        resp.getWriter().printf("<h1>New POST request</h1>");
    }
}
