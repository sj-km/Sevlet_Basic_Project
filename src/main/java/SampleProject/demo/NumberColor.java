package SampleProject.demo;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/numcolor")
public class NumberColor extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(req.getParameter("ncolor"));
		String color=req.getParameter("name");
		for(int i=1;i<=n;i++) {
			res.getWriter().print("<h1 style='background-color:"+color+";height:100px;width:100px;border-radius:50%;'></h1>");

		}
		
		
	}

}
