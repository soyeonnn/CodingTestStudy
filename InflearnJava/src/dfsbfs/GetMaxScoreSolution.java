package dfsbfs;

import java.util.Scanner;

public class GetMaxScoreSolution {

	static int answer = Integer.MIN_VALUE, n, m;
	boolean flag = false;
	
	public void solution(int L, int sum, int time, int[] ps, int[] pt) {
		if(time > m) return;
		if(L == n) {
			answer = Math.max(answer, sum);
		} else {
			solution(L+1, sum+ps[L], time+pt[L], ps, pt);
			solution(L+1, sum, time, ps, pt);
		}
	}
	
	public static void main(String[] args) {
		GetMaxScoreSolution T = new GetMaxScoreSolution();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		int [] a = new int[n];
		int [] b = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		T.solution(0, 0, 0, a, b);
		System.out.println(answer);
		sc.close();
	}
}
