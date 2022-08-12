package stackqueue;

import java.util.Scanner;
import java.util.Stack;

public class RemoveParentheses {

	public String solution(String str) {
		String answer = "";
		Stack<Character> stack = new Stack<>();
		for(char x : str.toCharArray()) {
			if(x == '(') stack.add(x);
			else if(x == ')') stack.pop();
			else {
				if(stack.isEmpty()) answer += x;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		RemoveParentheses T = new RemoveParentheses();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
		sc.close();
	}
}
