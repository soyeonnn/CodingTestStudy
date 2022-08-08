package twopointersslidingwindow;

import java.util.Scanner;

// 시간 초과
public class ContinuousSubsequence {

	public int solution(int n, int m, int[] arr) {
		int answer = 0, sum;
		for(int i=0; i<m; i++) {
			sum = 0;
			for(int j=0; j<=i; j++) sum += arr[j];
			for(int k=i+1; k<n; k++) {
				sum += (arr[k] - arr[k-i-1]);
				if(sum == m) answer++;
			}			
		}		
		return answer;
	}
	
	public static void main(String[] args) {
		ContinuousSubsequence T = new ContinuousSubsequence();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = sc.nextInt();
		System.out.print(T.solution(n, m, arr));
		sc.close();
	}
}
