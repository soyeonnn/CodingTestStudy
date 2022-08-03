package array;

import java.util.Scanner;

// 만약 배열을 사용하지 않는 경우
public class FibonacciSequenceSolution {

	public void solution(int n) {
		int a=1, b=1, c;
		System.out.print(a + " " + b + " ");
		for(int i=2; i<n; i++) {
			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
	}
	
	public static void main(String[] args) {
		FibonacciSequenceSolution T = new FibonacciSequenceSolution();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		T.solution(n);
		sc.close();
	}
}
