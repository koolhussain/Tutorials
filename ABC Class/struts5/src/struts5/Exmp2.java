package struts5;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.StrutsStatics;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class Exmp2 implements Interceptor, StrutsStatics {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		ActionContext ac=arg0.getInvocationContext();
		HttpServletRequest request=(HttpServletRequest)ac.get(HTTP_REQUEST);
		HttpSession session = request.getSession();
		session.setAttribute("Value2", 200);
		String temp = arg0.invoke();
		return temp;
	}

}
