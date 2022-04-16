package co.edureka.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static PreparedStatement pst;
	
	public void init(ServletConfig config) throws ServletException {		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/edureka", "root", "root");
			pst = con.prepareStatement("select * from users where username=? and password=?");
		}catch(Exception ex) {
			System.out.println(ex.toString());
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get form data
		String userName = request.getParameter("txt_uid");
		String password = request.getParameter("txt_pwd");
		
		try {
			pst.setString(1, userName);
			pst.setString(2, password);
			
			ResultSet rs = pst.executeQuery();
			
			if(rs.next()) {
				RequestDispatcher rd = request.getRequestDispatcher("welcome");
				rd.forward(request, response);
			}else {
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				
				out.println("<p style=text-align:center;color:yellow;font-size:18px>Invalid User Name / Password</p>");
				RequestDispatcher rd = request.getRequestDispatcher("login.html");
				rd.include(request, response);
			}
		}catch(Exception ex) {
			System.out.println(ex.toString());
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
