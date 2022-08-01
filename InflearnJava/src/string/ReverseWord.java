package string;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseWord {

	public ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<>();
		
		// 내 코드
		for(String x : str) {
			String tmp = "";
			for(int i=x.length()-1; i>=0; i--) {
				tmp += x.charAt(i);
			}
			answer.add(tmp);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		ReverseWord T = new ReverseWord();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String[] str = new String[n];
		for(int i=0; i<n; i++) {
			str[i] = kb.next();
		}
		for(String x : T.solution(n, str)) {
			System.out.println(x);
		}
		kb.close();
	}
}
