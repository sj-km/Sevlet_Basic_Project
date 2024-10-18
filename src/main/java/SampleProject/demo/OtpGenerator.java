package SampleProject.demo;

import java.io.IOException;
import java.util.Random;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/otp")
public class OtpGenerator extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int otp= new Random().nextInt(100000,1000000);
		res.getWriter().print("<h1>The OTP is : " + otp + "</h1>");	
	}
}
