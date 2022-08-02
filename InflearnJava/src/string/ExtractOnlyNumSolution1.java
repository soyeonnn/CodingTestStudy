package string;

import java.util.Scanner;

public class ExtractOnlyNumSolution1 {

	public int solution(String str) {
		int answer = 0;
		for(char x : str.toCharArray()) {
			if(x >= 48 && x <= 57) answer = answer * 10 + (x-48);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		ExtractOnlyNumSolution1 T = new ExtractOnlyNumSolution1();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
		sc.close();
	}
}
