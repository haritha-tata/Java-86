package co.edureka.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/form4")
public class FormServlet4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		
		out.println("<body bgcolor=pink>");
		out.println("<h2>"+session.getId()+ " -- "+ session.isNew()+"</h2>");
		
		out.println("<h2>");
		
		Enumeration<String> attributeNames = session.getAttributeNames();
		
		while(attributeNames.hasMoreElements()) {
			String attributeName = attributeNames.nextElement();
			String attributeValue = session.getAttribute(attributeName).toString();
			out.println(attributeName + " = " + attributeValue + "<br>");
		}
		
		/*
		Cookie[] cookies = request.getCookies();
		for(Cookie cookie : cookies) {
			String name = cookie.getName();
			String value = cookie.getValue();
			out.println(name + " = " + value + "<br>");
		}
		*/
		
		out.println("Salary = " + request.getParameter("t6"));
		
		out.println("</h2></body>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
