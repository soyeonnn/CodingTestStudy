package iteration;

import java.util.Scanner;

public class S2739 {

	public void solution(int a) {
		for(int i=1; i<=9; i++) {
			System.out.println(a + " * " + i + " = " + a*i);
		}
	}
	
	public static void main(String args[]) {
		S2739 T = new S2739();
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		T.solution(a);
		sc.close();
	}
}
