import java.util.LinkedList;

public class LLIntro {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add("ABC");
		ll.add(99.9f);
		ll.add('A');
		System.out.println(ll);
		ll.addFirst(0);
		System.out.println(ll);
		ll.addLast('B');
		System.out.println(ll);
		
		ll.offer(70);
		System.out.println(ll);
		ll.offerFirst(80);
		System.out.println(ll);
		ll.offerLast(90);
		System.out.println(ll);
		
		ll.push(100);
		System.out.println(ll);
		
		System.out.println(ll.pop());
		System.out.println(ll);
		
		System.out.println(ll.peek());
		System.out.println(ll);
		
		System.out.println(ll.poll());
		System.out.println(ll);
	}
	

}
