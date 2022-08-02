package string;

import java.util.Scanner;

public class ExtractOnlyNumSolution2 {

	public int solution(String str) {
		String answer = "";
		for(char x : str.toCharArray()) {
			if(Character.isDigit(x)) answer += x;
		}
		return Integer.parseInt(answer);
	}
	
	public static void main(String[] args) {
		ExtractOnlyNumSolution2 T = new ExtractOnlyNumSolution2();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
		sc.close();
	}
}
