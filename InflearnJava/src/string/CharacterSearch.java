package string;

import java.util.Scanner;

public class CharacterSearch {
	
	public int solution(String str, char t) {
		int answer = 0;
		
		// 둘 다 대문자로 만든다.
		str = str.toUpperCase();
		t = Character.toUpperCase(t);
		
		/*for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == t) {
				answer += 1;
			}
		}*/
		
		// 향상된 for 문 사용
		for(char x : str.toCharArray()) {
			if(x == t) answer += 1;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		CharacterSearch T = new CharacterSearch();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		char c = kb.next().charAt(0);
		System.out.println(T.solution(str, c));
		
		kb.close();
	}
}
