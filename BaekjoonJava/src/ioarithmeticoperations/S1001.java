package ioarithmeticoperations;

import java.util.Scanner;

public class S1001 {

	public int solution(int a, int b) {
		return a - b;
	}
	
	public static void main(String[] args) {
		S1001 T = new S1001();
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b= sc.nextInt();
		System.out.println(T.solution(a, b));
		sc.close();
	}
}
