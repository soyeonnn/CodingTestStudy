package stackqueue;

import java.util.Scanner;
import java.util.Stack;

public class PostfixOperation {
	
	public int calculator(int n1, int n2, char oper) {
		int answer = 0;		
		if(oper == '+') answer = n1 + n2;
		else if(oper == '-') answer = n2 - n1;
		else if(oper == '*') answer = n1 * n2;
		else if(oper == '/') answer = n2 / n1;	
		return answer;
	}
	
	public int solution(String str) {
		Stack<Integer> stack = new Stack<>();
		for(char x : str.toCharArray()) {
			if(Character.isDigit(x)) stack.push(Integer.parseInt(Character.toString(x)));
			else {
				int n1 = stack.pop();
				int n2 = stack.pop();
				stack.push(calculator(n1, n2, x));
			}
		}
		return stack.pop();
	}
	
	public static void main(String[] args) {
		PostfixOperation T = new PostfixOperation();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
		sc.close();
	}
}
