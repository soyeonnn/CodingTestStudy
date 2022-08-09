package twopointersslidingwindow;

import java.util.Scanner;

public class MaxLenContinuousSubsequence {

	public int solution(int n, int k, int[] arr) {
		int answer = 0;
		
		return answer;
	}
	
	public static void main(String[] args) {
		MaxLenContinuousSubsequence T = new MaxLenContinuousSubsequence();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = sc.nextInt();
		System.out.println(T.solution(n, k, arr));
		sc.close();
	}
}
