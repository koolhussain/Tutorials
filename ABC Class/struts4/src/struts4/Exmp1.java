package struts4;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.StrutsStatics;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class Exmp1 implements Interceptor, StrutsStatics {

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
		String temp=null;
		Object o = arg0.getAction();
		String un = ((RegisterAction) (o)).getUn();
		String pwd = ((RegisterAction) (o)).getPwd();
		String cpwd = ((RegisterAction) (o)).getCpwd();

		ActionContext ac = arg0.getInvocationContext();
		HttpServletResponse response = (HttpServletResponse) ac.get(HTTP_RESPONSE);

		if (un.length() == 0 || pwd.length() == 0 || cpwd.length() == 0) {
			response.sendRedirect("/struts4/error.jsp");
		} else {
			temp = arg0.invoke();
		}
		return temp;
	}

}
