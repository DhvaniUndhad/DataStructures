
public class Stack {

	public static void main(String[] args) {
		String name = "nivek";
		char[] ch = name.toCharArray();
		java.util.Stack<Character> s = new java.util.Stack<>();
		
		for(char i : ch){
			s.push(i);
		}
		
		System.out.println(s.peek());
		
		char result[] = new char[5];
		for(int j = 0;j<name.length(); j++){
			result[j] = s.pop();
		}
		System.out.println(String.valueOf(result));	
	}

	
}
