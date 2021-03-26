

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/hello.lti")
public class HelloServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");//this line is optional in this code as html can be interpreted by new browsers.
		PrintWriter out = response.getWriter();
		out.write("<html><body>");
		out.write("<h1>Hello World</h1>");
		out.write("<h2>" + LocalDateTime.now() + "</h2>");
		out.write("</body></html>");
	}

}
