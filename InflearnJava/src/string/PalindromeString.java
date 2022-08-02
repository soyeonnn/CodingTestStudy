package string;

import java.util.Scanner;

public class PalindromeString {

	public String solution(String str) {
		String answer = "YES";
		char[] s = str.toCharArray();
		int lt = 0, rt = str.length()-1;
		
		for(int i=0; i<str.length(); i++) {
			s[i] = Character.toUpperCase(s[i]);
		}
		
		while(lt < rt) {
			if(s[lt] != s[rt]) {
				return "NO";
			} else {
				lt++;
				rt--;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		PalindromeString T = new PalindromeString();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
		kb.close();
	}
}
