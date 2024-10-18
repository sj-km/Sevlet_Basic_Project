package SampleProject.demo;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/color")
public class Color extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String color=req.getParameter("name");
//		res.getWriter().print("<h1 style='color:"+color+"'>Happy Birthdy " + name + "</h1>");

		res.getWriter().print("<h1 style='background-color:"+color+";height:100px;width:100px;border-radius:50%;'></h1>");
//		 display:flex;justify-content:center;align-items:center;
	}
}
