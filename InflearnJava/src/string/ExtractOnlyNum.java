package string;

import java.util.Scanner;

public class ExtractOnlyNum {
	
	public int solution(String str) {
		int answer;
		str = str.toUpperCase().replaceAll("[A-Z]", "");
		answer = Integer.parseInt(str);
		return answer;
	}
	
	public static void main(String[] args) {
		ExtractOnlyNum T = new ExtractOnlyNum();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
		sc.close();
	}
}
