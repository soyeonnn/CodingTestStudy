package string;

import java.util.Scanner;

public class StringCompression {

	public String solution(String str) {
		String answer = "";
		char findChar = str.charAt(0);
		int findCount = 1;
		answer += findChar;
		
		for(int i=1; i<str.length(); i++) {
			if(str.charAt(i) == findChar) findCount ++;
			else {
				if(findCount > 1) answer += findCount;
				answer += str.charAt(i);
				findChar = str.charAt(i);
				findCount = 1;
			}
		}
		if(findCount > 1) answer += findCount;
		
		return answer;
	}
	
	public static void main(String[] args) {
		StringCompression T = new StringCompression();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
		sc.close();
	}
}
