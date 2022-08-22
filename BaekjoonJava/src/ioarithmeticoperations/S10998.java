package ioarithmeticoperations;

import java.util.Scanner;

public class S10998 {

	public int solution(int a, int b) {
		return a * b;
	}
	
	public static void main(String[] args) {
		S10998 T = new S10998();
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b= sc.nextInt();
		System.out.println(T.solution(a, b));
		sc.close();
	}
}
