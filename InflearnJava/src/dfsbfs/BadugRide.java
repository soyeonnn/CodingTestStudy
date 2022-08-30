package dfsbfs;

import java.util.*;

public class BadugRide {

	static int c, n;
	static int maxWeight = Integer.MIN_VALUE;
	
	public void solution(int L, int sum, int[] arr) {
		if(L == n) {
			if(sum < c && maxWeight < sum) maxWeight = sum;
		} else {
			solution(L+1, sum+arr[L], arr);
			solution(L+1, sum, arr);
		}
	}
	
	public static void main(String[] args) {
		BadugRide T = new BadugRide();
		Scanner sc = new Scanner(System.in);
		c = sc.nextInt();
		n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = sc.nextInt();
		T.solution(0, 0, arr);
		System.out.println(maxWeight);
		sc.close();
	}
}
