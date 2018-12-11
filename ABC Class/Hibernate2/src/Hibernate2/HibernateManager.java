package Hibernate2;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateManager {
	Session session;

	public void connect() {
		// Connection code
		// these 5 lines would remain same and is used for getting connection
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml"); // connects to cfg
		ServiceRegistryBuilder builder = new ServiceRegistryBuilder().applySettings(configuration.getProperties());
		SessionFactory sessionFactory = configuration.buildSessionFactory(builder.buildServiceRegistry());

		session = sessionFactory.openSession();
		System.out.println("Connected to Pf....");
	}

	public void insert(Student s) // inserts a row into the table
	{
		session.beginTransaction();
		session.save(s);
		session.getTransaction().commit();
		System.out.println("Insertion success...");
	}

	public void select() {
		session.beginTransaction();
		Query q = session.createQuery("From Student");
		List l = q.list();
		Iterator itr = l.iterator();
		while (itr.hasNext()) {
			Student s = (Student) itr.next();
			System.out.println(s.getSid() + " " + s.getSname());
		}
	}

	public void select(int sid) {
		session.beginTransaction();
		Query q = session.createQuery("From Student where sid=:sid");
		q.setInteger("sid", sid);
		List l = q.list();
		Iterator itr = l.iterator();
		while (itr.hasNext()) {
			Student s = (Student) itr.next();
			System.out.println(s.getSid() + " " + s.getSname());
		}
	}
	
	public void updateName(int sid, String newName) {
		session.beginTransaction();
		Student s = (Student)session.get(Student.class, sid);
		s.setSname(newName);
		session.update(s);
		session.getTransaction().commit();
	}
	
	public void deleteStudent(int sid) {
		session.beginTransaction();
		Student s = (Student)session.get(Student.class, sid);
		session.delete(s);
		session.getTransaction().commit();
	}

}
