package SampleProject.demo;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/div")
public class Divide extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		double num1=Integer.parseInt(req.getParameter("number1"));
		double num2=Integer.parseInt(req.getParameter("number2"));
		res.getWriter().print("<h1>Division is : " + (num1/num2) + "</h2>");
		
	}

}
