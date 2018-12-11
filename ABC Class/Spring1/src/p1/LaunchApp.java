package p1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaunchApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		Employee e = (Employee) ac.getBean("id1");
		System.out.println(e.getCompany_name());
	}

}
