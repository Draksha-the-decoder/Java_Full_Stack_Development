 import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

 
@WebServlet("/HelloServlet") // url pattern
public class HelloServlet extends HttpServlet {
 	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		//connect to browser from where we got request
		PrintWriter out = response.getWriter(); 
		// will be printed on client browser
		response.setContentType("text/html");
		out.println("Hello Client Browser");
		out.println("<font face=\"ariel\" size=\"5\" color=\"red\">Good Morning</font>");
	}
 
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	} 
} 
