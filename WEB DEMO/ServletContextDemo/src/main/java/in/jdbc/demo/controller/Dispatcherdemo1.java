package in.jdbc.demo.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Dispatcherdemo1")
public class Dispatcherdemo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1> before dispatching in main servlet</h2>");
		request.setAttribute("name", "shanky");
		request.setAttribute("age", 23);
		
		RequestDispatcher rd =request.getRequestDispatcher("/Dispatcherdemo2");
		rd.include(request, response);
		
		out.println("<h1> after dispatching again in main servlet</h2>");
		
		
	}

}
