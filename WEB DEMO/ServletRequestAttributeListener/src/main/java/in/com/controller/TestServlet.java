package in.com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/test")
public class TestServlet extends HttpServlet {
	static {
		System.out.println("testservlet .class file is loaded");
	}
	private static final long serialVersionUID = 1L;
	
	public TestServlet()
	{
		System.out.println("testServlet class objectis created");
	}
	
	public void init(ServletConfig config)
	{
		System.out.println("testservlet object is initiated");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		request.setAttribute("hyder", "java");
		request.setAttribute("shashank", "spring-boot");
		request.removeAttribute("hyder");
		request.setAttribute("shashank", "microservices");
		out.println("<h2 style='color:green;text-align:center'>THIS IS INSIDE SERVLET</h2>");
		
	}
	public void destroy()
	{
		System.out.println("testservlet object is destroyed");
	}

}
