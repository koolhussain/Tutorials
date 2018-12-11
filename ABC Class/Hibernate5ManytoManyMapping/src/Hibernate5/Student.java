package Hibernate5;

import java.util.Set;

public class Student {
	private int sid;
	private String sname;
	private Set course;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Set getCourse() {
		return course;
	}
	public void setCourse(Set course) {
		this.course = course;
	}
	
}
