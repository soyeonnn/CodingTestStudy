package string;

import java.util.Scanner;

public class ShortestCharDistance {

	public int[] solution(String str, char c) {
		int[] answer = new int[str.length()];
		int p = 1000;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == c) {
				p = 0;
				answer[i] = p;
			}
			else {
				p++;
				answer[i] = p;
			}
		}
		
		p = 1000;
		for(int i=str.length()-1; i>=0; i--) {
			if(str.charAt(i) == c) p = 0;
			else {
				p++;
				if(answer[i] > p) answer[i] = p;
				// answer[i] = Math.min(answer[i], p);
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		ShortestCharDistance T = new ShortestCharDistance();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char c = sc.next().charAt(0);
		for(int distance : T.solution(str, c)) {
			System.out.print(distance + " ");
		}
		sc.close();
	}
}
