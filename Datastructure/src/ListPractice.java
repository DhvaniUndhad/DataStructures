import java.util.*;

public class ListPractice {

	public static void main(String[] args) {

		List<String> l1 = new ArrayList();
		l1.add("v");
		l1.add("i");
		l1.add("v");
		l1.add("e");
		l1.add("k");

		System.out.println(l1.indexOf("v"));

		List<String> l2 = new ArrayList();
		l2.add("d");
		l2.add("h");
		l2.addAll(1, l1);
		System.out.println(l2);
		l2.add(2, "z");
		System.out.println(l2);
		l2.set(2, "y");
		System.out.println(l2);
		Collections.sort(l2);
		System.out.println(l2);
		
		
		

	}

}
