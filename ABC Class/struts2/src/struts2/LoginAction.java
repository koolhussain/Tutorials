package struts2;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	
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
	
	public void validate() {
		if(un.length() == 0) {
			addFieldError("un","Username is Empty");
		}
		if(pwd.length() == 0) {
			addFieldError("pwd", "Password is Empty");
		}
		
	}
	
	public String execute() {
		System.out.println(un);
		System.out.println(pwd);
		return "s";
	}
	

}
