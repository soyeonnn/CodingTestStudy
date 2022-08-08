package twopointersslidingwindow;

import java.util.Scanner;

public class ContinuousSubsequenceSolution {

	public int solution(int n, int m, int[] arr) {
		int answer = 0, lt = 0, sum = 0;
		
		for(int rt=0; rt<n; rt++) {
			sum += arr[rt];
			if(sum == m) answer++;
			while(sum >= m) {
				sum -= arr[lt++];
				if(sum == m) answer++;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		ContinuousSubsequenceSolution T = new ContinuousSubsequenceSolution ();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = sc.nextInt();
		System.out.print(T.solution(n, m, arr));
		sc.close();
	}
}
