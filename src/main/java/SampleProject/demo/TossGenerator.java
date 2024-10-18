package SampleProject.demo;

import java.io.IOException;
import java.util.Random;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/toss")
public class TossGenerator extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int num = new Random().nextInt(0,2);
		String toss="";
		if(num==0) {
			toss="Heads";
		}else {
			 toss="Tails";
		}
		res.getWriter().print("<h1> The coin is Flipped and it is : " + toss +"</h1>");
		
	}

}
