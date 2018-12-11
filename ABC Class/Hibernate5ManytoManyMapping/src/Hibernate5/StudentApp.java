package Hibernate5;

import java.util.HashSet;

public class StudentApp {

	public static void main(String[] args) {
		Course c1 = new Course();
		Course c2 = new Course();
		Course c3 = new Course();
		
		c1.setCname("Maths");
		c2.setCname("Social");
		c3.setCname("Science");
		
		HashSet hs = new HashSet();
		hs.add(c1);
		hs.add(c2);
		hs.add(c3);
		
		Student s1= new Student();
		Student s2= new Student();
		Student s3= new Student();
		
		s1.setSname("Rohit");
		s2.setSname("Tushar");
		s3.setSname("Nitin");
		
		s1.setCourse(hs);
		s2.setCourse(hs);
		s3.setCourse(hs);
		
		HibernateManager hm = new HibernateManager();
		hm.connect();
		hm.insert(s1);
		hm.insert(s2);
		hm.insert(s3);
	}

}
