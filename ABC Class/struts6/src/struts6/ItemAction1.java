package struts6;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

public class ItemAction1 implements SessionAware {
	private String choco;
	Map m;

	public String getChoc() {
		return choco;
	}

	public void setChoc(String choc) {
		this.choco = choco;
	}

	@Override
	public void setSession(Map m) {
		this.m = m;
	}

	public String execute() {
		m.put("choco", choco);
		return "item";
	}

}
