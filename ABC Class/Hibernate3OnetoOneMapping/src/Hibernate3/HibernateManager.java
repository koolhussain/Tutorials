package Hibernate3;

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

	public void insert(Employee s) // inserts a row into the table
	{
		session.beginTransaction();
		session.save(s);
		session.getTransaction().commit();
		System.out.println("Insertion success...");
	}

	
}
