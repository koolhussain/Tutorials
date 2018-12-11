package struts5;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;

public class RegisterAction implements ServletRequestAware {
	private String un;
	private String pwd;

	public String getUn() {
		return un;
	}

	public void setUn(String un) {
		this.un = un;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		HttpSession session = arg0.getSession();
		int val1 = (int) session.getAttribute("Value1");
		int val2 = (int) session.getAttribute("Value2");
		System.out.println(val1);
		System.out.println(val2);
	}

	public String execute() {

		return "s";
	}
}
