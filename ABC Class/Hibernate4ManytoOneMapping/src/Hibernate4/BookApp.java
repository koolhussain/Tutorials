package Hibernate4;

public class BookApp {

	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();
	
		b1.setBname("Java");
		b2.setBname("C");
		b3.setBname("C++");
		
		Publisher p = new Publisher();
		
		p.setPname("Pearson");
		
		b1.setPublisher(p);
		b2.setPublisher(p);
		b3.setPublisher(p);
		
		HibernateManager hm = new HibernateManager();
		hm.connect();
		hm.insert(b1);
		hm.insert(b2);
		hm.insert(b3);
	}

}
