package smartcall;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.sip.*;
public class Test {
	public static void main(String[] args){
		//System.out.print("sdfsdfsd");
		//int value = System.in.read();
		SoftPhone sp = new SoftPhone();
		try {
			sp.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
 class SoftPhone extends  javax.servlet.sip.SipServlet{
	 protected void doRegister(SipServletRequest request){
		 request.createResponse(488);
	 }
}
 class SoftConfig implements ServletConfig{

	@Override
	public String getInitParameter(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Enumeration getInitParameterNames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ServletContext getServletContext() {
		// TODO Auto-generated method stub
		ServletContext context = new ServletContext();
		return null;
	}

	@Override
	public String getServletName() {
		// TODO Auto-generated method stub
		return null;
		
		
	}
	 
 }
 
 class SoftContext implements ServletContext{
	 
 }
