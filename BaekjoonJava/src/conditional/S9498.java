package conditional;

import java.util.Scanner;

public class S9498 {

	public String solution(int score) {
		String answer = "F";
		if(score >= 90) answer = "A";
		else if(score >= 80) answer = "B";
		else if(score >= 70) answer = "C";
		else if(score >= 60) answer = "D";
		return answer;
	}
	
	public static void main(String args[]) {
		S9498 T = new S9498();
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		System.out.println(T.solution(score));
		sc.close();
	}
}
