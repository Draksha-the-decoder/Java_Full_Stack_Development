import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	Connection con;

	public void init(ServletConfig config) {
		String driver = config.getInitParameter("driver");
		String url = config.getInitParameter("url");
		String username = config.getInitParameter("username");
		String password = config.getInitParameter("password");
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection established with RegisterServlet");
		} catch (Exception e) {
			System.out.println(e);
		}
		// if in future i want to use another server then no need to touch this servlet
		// init code,
		// just change the config param values in the web.xml file(Register servlet ->
		// local to this file).
	}

	// service internally calls goGetMethod
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String name = request.getParameter("name");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		try {
			PreparedStatement st = con.prepareStatement(
					"insert into users values ('" + name + "','" + username + "','" + password + "')");
			st.executeUpdate();
			out.println("Registered Successfully<br>");
			out.println("Click <a href=\"/LoginApplication/Login.html\">here</a> to login");
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
			System.out.println("Register Servelet destroyed, connection closed");
		} catch (Exception e) {

		}
	}

}
