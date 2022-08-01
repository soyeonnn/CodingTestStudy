package string;

import java.util.Scanner;

public class WordInSentence {

	public String Solution(String str) {
		String answer = "";
		int maxLen = Integer.MIN_VALUE, pos;  // 가장 작은 값으로 초기화 한다.
//		String[] s = str.split(" ");
//		for(String x : s) {
//			if(x.length() > maxLen) {
//				maxLen = x.length();
//				answer = x;
//			}
//		}
		
		while((pos = str.indexOf(' ')) != -1) {  // indexOf()에 나온 문자의 인덱스를 반환한다.
			String tmp = str.substring(0, pos);
			int len = tmp.length();
			if(len > maxLen) {
				maxLen = len;
				answer = tmp;
			}
			str = str.substring(pos+1);
		}
		if(str.length() > maxLen) answer = str;
		return answer;
	}
	
	public static void main(String[] args) {
		WordInSentence T = new WordInSentence();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();  // 한 줄을 입력받기 때문에 nextLine을 쓴다.
		System.out.println(T.Solution(str));
		kb.close();
	}
}
