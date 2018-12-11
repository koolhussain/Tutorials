package ResourceBundle;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {
	private String un;
	private String pw;
	public String getUn() {
		return un;
	}
	public void setUn(String un) {
		this.un = un;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public String execute() {
		System.out.println(getText("abc"));
		System.out.println(getText("abc"));
		System.out.println(getText("abc"));
		System.out.println(getText("abc"));
		System.out.println(getText("abc"));
		System.out.println(getText("abc"));
		System.out.println(getText("abc"));
		System.out.println(getText("abc"));
		System.out.println(getText("abc"));
		return "s";
	}

}
