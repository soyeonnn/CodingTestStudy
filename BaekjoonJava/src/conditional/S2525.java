package conditional;

import java.util.Scanner;

public class S2525 {

	public void solution(int h, int m, int c) {
		int total = h * 60 + m + c;
		System.out.println(total / 60 % 24 + " " + total % 60);
	}
	
	public static void main(String args[]) {
		S2525 T = new S2525();
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();
		T.solution(h, m, c);
		sc.close();
	}
}
