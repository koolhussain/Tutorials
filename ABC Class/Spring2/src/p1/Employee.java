package p1;

public class Employee {
	private int empid;
	private String ename;
	private Address addr;
	
	public Employee(int empid, String ename, Address addr) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.addr = addr;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
	public void disp() {
		System.out.println(empid);
		System.out.println(ename);
		System.out.println(addr);
	}
	

}
