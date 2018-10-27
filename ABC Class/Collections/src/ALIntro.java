import java.util.ArrayList;

public class ALIntro {

	public static void main(String[] args) {
		ArrayList al1 = new ArrayList();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);
		al1.add("ABC");
		al1.add(99.9f);
		al1.add('A');
		System.out.println(al1);

		ArrayList al2 = new ArrayList();
		al2.add(100);
		al2.add(200);
		al2.add(300);
		al2.add(400);
		al2.add("ABCD");
		al2.add(99.99f);
		al2.add('B');
		System.out.println(al2);

		al1.addAll(al2);
		System.out.println(al1);

		ArrayList al3 = new ArrayList();
		al3.add(1000);
		al3.add(2000);
		al3.add(3000);
		al3.add(4000);
		al3.add(5000);
		al3.add(3000);
		System.out.println(al3);

		al1.addAll(2, al3);
		System.out.println(al1);

		System.out.println(al1.contains(20));
		System.out.println(al1.contains(99));
		System.out.println(al1.indexOf(3000));
		System.out.println(al1.lastIndexOf(3000));
		System.out.println(al1.get(7));
		System.out.println(al1.isEmpty());
		al1.clear();
		System.out.println(al1.isEmpty());

		ArrayList al4 = new ArrayList();
		al4.add(10);
		al4.add(20);
		al4.add(30);
		al4.add(40);
		System.out.println(al4.size());
		al4.trimToSize();
		System.out.println(al4);
		
		al4.set(0, 100);
		System.out.println(al4);
		System.out.println(al2);
		al2.retainAll(al4);
		System.out.println(al2);

	}

}
