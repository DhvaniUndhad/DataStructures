import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPractice {

	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<String>();
		l.add("Dhvani");
		l.add("Undhad");
		l.addFirst("Hello");
		l.add(3, "null");
		System.out.println(l);
		
		LinkedList<String> l2 = new LinkedList<String>();
		l2.add("Vivek");
		l2.add("Bhalala");
		l2.addAll(l);
		System.out.println(l2);
		l2.offer("Welcome");
		
		l2.push("Pratik");
		System.out.println(l2);
		
		Iterator i = l2.descendingIterator();
		while(i.hasNext()){
			
			System.out.print(i.next()+ " ");
		}
		
		
		
	}

}
