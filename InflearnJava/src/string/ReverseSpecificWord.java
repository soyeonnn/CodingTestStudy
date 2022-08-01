package string;

import java.util.Scanner;

public class ReverseSpecificWord {

	public String solution(String str) {
		String answer = "";
		int lt = 0, rt = str.length()-1;
		char[] s = str.toCharArray();
		while(lt < rt) {
			if(Character.isAlphabetic(s[lt]) && Character.isAlphabetic(s[rt])) {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
			if(!Character.isAlphabetic(s[lt])) lt++;
			if(!Character.isAlphabetic(s[rt])) rt --;
			
		}
		answer = String.valueOf(s);
		return answer;
	}
	
	public static void main(String[] args) {
		
		ReverseSpecificWord T = new ReverseSpecificWord();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
		kb.close();
	}
}
