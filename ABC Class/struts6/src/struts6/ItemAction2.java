package struts6;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

public class ItemAction2 implements SessionAware {
	private String bread;
	Map m;

	public String getBreed() {
		return bread;
	}

	public void setBreed(String breed) {
		this.bread = bread;
	}

	@Override
	public void setSession(Map m) {
		this.m = m;
	}

	public String execute() {
		m.put("bread", bread);
		return "s";
	}

}
