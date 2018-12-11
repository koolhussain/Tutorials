package Hibernate2;

public class StudentApp {

	public static void main(String[] args) {

		Student s = new Student();
		s.setSid(2);
		s.setSname("Ahmad");
		
		HibernateManager hm = new HibernateManager();
		hm.connect();
		//hm.insert(s);
		//hm.select(2);
		//hm.updateName(2, "Rohit");
		hm.deleteStudent(1);
		hm.select();
	}

}
