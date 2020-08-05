package ru.geekbrains;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Cart", urlPatterns = "/cart")
public class Cart extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Main.logger.info("New GET request");
        resp.getWriter().printf("<h1>Корзина</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Main.logger.info("New POST request");
        resp.getWriter().printf("<h1>New POST request</h1>");
    }
}
