
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/LoginServlet") // url pattern or alias
public class LoginServlet extends HttpServlet {
	Connection con;

	public void init(ServletConfig config) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/WebApp", "root", "P@$$w0rd");
			System.out.println("Connection established with LoginServlet");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		try {
			PreparedStatement st = con.prepareStatement(
					"select * from users where username='" + username + "' and password='" + password + "'");
			ResultSet rs = st.executeQuery();
			if (rs.next()) {
				String name = rs.getString("name");
				out.println("Welcome " + name);
				out.println("<br>Click <a href=\"/LoginApplication/fact_input.html\">here</a> to login");
			} else {
				out.println("Login Failure");
				out.println("<br>Click <a href=\"/LoginApplication/Login.html\">here</a> to login");
			}
		} catch (Exception e) {
			out.println(e);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	public void destroy() {
		try {
			con.close();
			System.out.println("Login Servlet destroyed, connection closed");
		} catch (Exception e) {

		}
	}

}
