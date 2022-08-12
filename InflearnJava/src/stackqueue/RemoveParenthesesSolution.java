package stackqueue;

import java.util.Scanner;
import java.util.Stack;

public class RemoveParenthesesSolution {

	public String solution(String str) {
		String answer = "";
		Stack<Character> stack = new Stack<>();
		for(char x : str.toCharArray()) {
			if(x == ')') {
				while(stack.pop() != '(');
			} else stack.push(x);
		}
		for(int i=0; i<stack.size(); i++) answer += stack.get(i);
		return answer;
	}
	
	public static void main(String[] args) {
		RemoveParenthesesSolution T = new RemoveParenthesesSolution();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
		sc.close();
	}
}
