package conditional;

import java.util.Scanner;

public class S2753 {
	public int solution(int year) {
		int answer = 0;
		if(((year % 4 == 0) && (year % 100 != 0)) || year % 400 == 0) answer = 1;
		return answer;
	}
	
	public static void main(String args[]) {
		S2753 T = new S2753();
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		System.out.println(T.solution(year));
		sc.close();
	}
}
