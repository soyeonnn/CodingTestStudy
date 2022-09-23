package conditional;

import java.util.Scanner;

public class S2884 {

	public void solution(int h, int m) {
		int answer_h = h, answer_m = m;
		
		if(m-45 < 0) {
			if(h-1 < 0) answer_h = 23;
			else answer_h -= 1;
			answer_m = 60-(45-m);
		} else answer_m -= 45;
		
		System.out.println(answer_h + " " + answer_m);
	}
	
	public static void main(String args[]) {
		S2884 T = new S2884();
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		T.solution(h, m);
		sc.close();
	}
}
