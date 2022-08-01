package string;

import java.util.Scanner;

public class CaseConversion {

	public String Solution(String str) {
		String answer = "";
		
		for(char x : str.toCharArray()) {
//			if(Character.isUpperCase(x)) answer += Character.toLowerCase(x);
//			else answer += Character.toUpperCase(x);
			
			// 아스키 코드로 짜보기
			if ( x >= 97 && x <= 122) answer += (char)(x-32);
			else answer += (char)(x+32);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		CaseConversion T = new CaseConversion();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.Solution(str));
		kb.close();
	}
}
