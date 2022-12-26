package dfsbfs;

import java.util.Scanner;

public class BadugRideSolution {

	static int answer = Integer.MIN_VALUE, c, n;
	
	public void solution(int L, int sum, int[] arr) {
		if(sum > c) return;
		if(L == n) {
			answer = Math.max(answer, sum);
		} else {
			solution(L+1, sum+arr[L], arr);
			solution(L+1, sum, arr);
		}
	}
	
	public static void main(String[] args) {
		BadugRideSolution T = new BadugRideSolution();
		Scanner sc = new Scanner(System.in);
		c = sc.nextInt();
		n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = sc.nextInt();
		T.solution(0, 0, arr);
		System.out.println(answer);
		sc.close();
	}
}
