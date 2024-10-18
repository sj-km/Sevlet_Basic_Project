package SampleProject.demo;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/birthdat-wish")
public class WishMaker extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=req.getParameter("name");   //the value of name attribute in index.html and this getParameter name should be same.
		String color="blue";
		res.getWriter().print("<h1 style='color:"+color+"'>Happy Birthdy " + name + "</h1>");
	}
}
