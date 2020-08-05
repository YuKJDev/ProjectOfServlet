import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

public class Order extends HttpServlet {
    private static final Logger logger = (Logger) LoggerFactory.getLogger(Order.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        logger.info("New GET request");

        resp.getWriter().printf("<h1>New GET request</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        logger.info("New POST request");

        resp.getWriter().printf("<h1>New POST request</h1>");
    }
}
