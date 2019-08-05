import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		List<Book> list = new ArrayList<Book>();
		Book b1 = new Book(101, "abc", "dhvani", "abcd", 5);
		Book b2 = new Book(102, "xyz", "vivek", "xyzz", 10);
		Book b3 = new Book(103, "pqr", "kesha", "pqrst", 15);
		list.add(b1);
		list.add(b2);
		list.add(b3);

		for (Book b : list) {

			System.out.println(b.id +" "+  b.name +" "+ b.author +" "+ b.publisher +" "+ b.quantity);
		}

	}

}
