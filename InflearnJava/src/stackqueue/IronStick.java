package stackqueue;

import java.util.Scanner;
import java.util.Stack;

public class IronStick {

	public int solution(String str) {
		int answer = 0, index = 0, cur = 0, total = 0;
		Stack<Character> stack = new Stack<>();
		while(index < str.length()) {
			if(str.charAt(index) == '(') {
				if(str.charAt(index+1) == ')' && !stack.isEmpty()) {
					cur++;
					total++;
					index++;
				} else if(str.charAt(index+1) == ')' && stack.isEmpty()) {
					index += 2;
				} else {
					cur = 0;
					stack.push(str.charAt(index));
					index++;
				}			
			} else if(str.charAt(index) == ')') {
				stack.pop();
				answer += (cur+1);
				cur = total;
				index++;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		IronStick T = new IronStick();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
		sc.close();
	}
}
