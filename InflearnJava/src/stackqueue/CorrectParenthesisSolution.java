package stackqueue;

import java.util.Scanner;
import java.util.Stack;

// 내 풀이와 동일><
public class CorrectParenthesisSolution {

	public String solution(String str) {
		String answer = "YES";
		Stack<Character> stack = new Stack<>();	
		for(char x : str.toCharArray()) {
			if(x == '(') stack.push(x);
			else {
				if(stack.isEmpty()) return "NO";
				stack.pop();
			}
		}	
		if(!stack.isEmpty()) return "NO";
		return answer;
	}
	
	public static void main(String[] args) {
		CorrectParenthesisSolution T = new CorrectParenthesisSolution();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
		sc.close();
	}
}
