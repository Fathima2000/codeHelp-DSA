package stack;

import java.util.Stack;

public class insertAtBottom3 {
	
	static void insertAtBottom(Stack s, int target) {
		if(s.isEmpty()) {
			s.push(target);
			return;
		}
		
		int ele = (int) s.pop();
		insertAtBottom(s, target);
		
		s.push(ele);
	}
	
	static void reverse(Stack s) {
		if(s.isEmpty()) {
			return;
		}
		
		int ele = (int) s.pop();
		reverse(s);
		
		insertAtBottom(s, ele);
	}

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		
		
		
	}

}
