package conditional;

import java.util.Scanner;

public class S1330 {

	public String solution(int a, int b) {
		String answer = "==";
		if(a > b) answer = ">";
		else if(a < b) answer = "<";
		return answer;
	}
	
	public static void main(String args[]) {
		S1330 T = new S1330();
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(T.solution(a, b));
		sc.close();
	}
}
