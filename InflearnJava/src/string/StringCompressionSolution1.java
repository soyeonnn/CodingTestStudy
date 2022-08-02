package string;

import java.util.Scanner;

public class StringCompressionSolution1 {

	public String solution(String str) {
		String answer = "";
		str = str + " ";
		int cnt = 1;
		
		for(int i=0; i<str.length()-1; i++) {
			if(str.charAt(i) == str.charAt(i+1)) cnt++;
			else {
				answer += str.charAt(i);
				if(cnt > 1) answer += String.valueOf(cnt);
				cnt = 1;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		StringCompressionSolution1 T = new StringCompressionSolution1();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
		sc.close();
	}
}
