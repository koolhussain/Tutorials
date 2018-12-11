package Hibernate3;

public class Main {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmpname("Ajay");
		
		EmpAddress empaddr = new EmpAddress();
		empaddr.setDno(12);
		empaddr.setLane("2nd CrossRoad");
		empaddr.setCity("BLR");
		empaddr.setState("Karnataka");
		empaddr.setCountry("India");
		e.setAddr(empaddr);
		
		HibernateManager hm = new HibernateManager();
		hm.connect();
		hm.insert(e);
	}

}
