package Assignments;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;


public class Stackandqueeebrackets {
	public static void main(String[] args) {
		int res = solution("(()(())())");
		if(res==1) 
		System.out.println("Valid");
		else 
		System.out.println("invalid");
		
	}
	public static int solution(String S) {
		//ArrayList<String> brackets =new ArrayList<String>();
		
		List<Character> open = Arrays.asList('(');
		List<Character> close = Arrays.asList(')');
		
		Stack<Character> stack = new Stack<Character>();
		for(int i = 0;i<S.length();i++){
		if(open.contains(S.charAt(i))) {
			stack.push(S.charAt(i));
		}
		else if (close.contains(S.charAt(i)) && !stack.isEmpty()) {
			Character top = stack.peek(); // ')'
			if(open.indexOf(top)== close.indexOf(S.charAt(i))) {
			stack.pop();
		}
		else {
			return 0;
		  }
		}
		else {
			return 0;
		}
		}
	     return stack.isEmpty() ?1:0;
		}
}
