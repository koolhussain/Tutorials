package Hibernate3;

public class Employee {
	private int empid;
	private String empname;
	private EmpAddress addr;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public EmpAddress getAddr() {
		return addr;
	}
	public void setAddr(EmpAddress addr) {
		this.addr = addr;
	}
	
}
