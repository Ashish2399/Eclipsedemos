package stackandqueue;

import java.util.Stack;

public class simplestachexp {
public static void main(String[] args) {
	Stack<Character> stack = new Stack<Character>();
	stack.push('A');
	stack.push('b');
	stack.push('c');
	stack.push('d');
	System.out.println(stack.size());
	System.out.println(stack.peek());
	
	stack.pop();
	System.out.println(stack.size());
	System.out.println(stack.peek());
}
}
