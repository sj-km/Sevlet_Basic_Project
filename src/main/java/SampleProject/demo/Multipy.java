package SampleProject.demo;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/mul")

public class Multipy extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int num1=Integer.parseInt(req.getParameter("number1"));
		int num2=Integer.parseInt(req.getParameter("number2"));
		res.getWriter().print("<h1>Multiplication is : " + (num1*num2) + "</h2>");
		
	}

}
