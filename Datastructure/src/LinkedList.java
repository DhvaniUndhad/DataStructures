
public class LinkedList {

	Node head;

	public static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
		}
	}

	public static void main(String[] args) {

		LinkedList lList = new LinkedList();
		Node n = new Node(1);
		lList.head = n;
		Node second = new Node(2);
		Node third = new Node(3);
		Node four = new Node(4);

		lList.head.next = second;
		second.next = third;
		third.next = four;
		System.out.println("Original Linked list: ");
		lList.printList(lList.head);

		 lList.push(0);
		
		 System.out.println("After pushing 0");
		 lList.printList(lList.head);

		 System.out.println("After appending 5");
		 lList.append(5);
		 lList.printList(lList.head);
		
		 System.out.println("Inserting 10 after 3");
		 lList.insertAfter(3, 10);
		 lList.printList(lList.head);

		System.out.println("Deleting 10");
		lList.deleteData(10);
		lList.printList(lList.head);
	}

	public void printList(Node head) {
		while (head != null) {
			System.out.print(head.data + " -> ");
			head = head.next;
		}
		System.out.print("NULL\n");
	}

	public void push(int d) {
		Node zero = new Node(d);
		zero.next = head;
		head = zero;
	}

	public void append(int d) {
		Node five = new Node(d);
		five.next = null;
		Node temp = head;

		if (temp == null) {
			head = five;
			return;
		}

		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = five;
	}

	public void insertAfter(int data, int d) {
		Node newNode = new Node(d);
		Node temp = head;

		if (head == null) {
			System.out.println("LinkedList is empty, cannot add " + d + " after " + data);
			return;
		}

		while (temp.data != data) {

			temp = temp.next;
			if (temp == null) {
				System.out.println("Cannot add " + d + " after " + data + ", because " + data + " do not exists");
				return;
			}
		}
		Node oldNext = temp.next;
		temp.next = newNode;
		newNode.next = oldNext;
	}

	public void deleteData(int d) {

		if (head == null) {
			System.out.println("LinkedList is empty");
			return;
		}

		Node temp = head;
		while (temp.next != null && temp.next.data != d) {
			temp = temp.next;
		}

		if (temp.next == null) {
			System.out.println("Data not found");
			return;
		}
		temp.next = temp.next.next;

	}
}
