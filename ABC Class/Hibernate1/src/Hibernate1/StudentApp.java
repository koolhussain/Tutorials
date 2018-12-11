package Hibernate1;

public class StudentApp {

	public static void main(String[] args) {

		Student s = new Student();
		s.setSid(1);
		s.setSname("Ajay");
		
		HibernateManager hm = new HibernateManager();
		hm.connect();
		hm.insert(s);
	}

}
