package string;

import java.util.Scanner;

// 해결 X
public class ValidPalindrome {
	
	public String solution(String str) {
		String answer = "YES";
		str = str.toUpperCase();
		int lt = 0, rt = str.length()-1;
		while(lt < rt) {
			if(!Character.isAlphabetic(str.charAt(lt))) lt ++;
			if(!Character.isAlphabetic(str.charAt(rt))) rt --;
			else {
				if(str.charAt(lt) != str.charAt(rt)) return "NO";
				lt++;
				rt--;
			}			
		}
		return answer;
	}
	
	public static void main(String[] args) {
		ValidPalindrome T = new ValidPalindrome();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(T.solution(str));
		kb.close();
	}
}
