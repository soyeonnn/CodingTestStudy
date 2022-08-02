package string;

import java.util.Scanner;

public class CryptogramSolution {

	public String solution(String str, int num) {
		String answer = "";	
		for(int i=0; i<num; i++) {
			String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
			int n = Integer.parseInt(tmp, 2);
			answer += (char)n;
			str = str.substring(7);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		CryptogramSolution T = new CryptogramSolution();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String str = sc.next();
		System.out.println(T.solution(str, num));
		sc.close();
	}
}
