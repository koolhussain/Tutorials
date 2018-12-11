package p1;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo extends HttpServlet {
	public void service(HttpServletRequest x, HttpServletResponse y) {
		try {
			y.sendRedirect("/struts/hello.html");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}