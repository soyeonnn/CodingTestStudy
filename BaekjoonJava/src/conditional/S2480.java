package conditional;

import java.util.Scanner;

public class S2480 {

	public int solution(int a, int b, int c) {
		int answer = 0;
		
		if(a==b && b==c) answer = 10000 + a * 1000;
		else if(a==b || a==c) answer = 1000 + a * 100;
		else if(b==c) answer = 1000 + b * 100;
		else answer = (int)Integer.max(a, Integer.max(b, c)) * 100;
		return answer;
	}
	
	public static void main(String args[]) {
		S2480 T = new S2480();
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println(T.solution(a, b, c));
		sc.close();
	}
}
