package dfsbfs;

import java.util.Scanner;

public class SubsetSameSum {
	static int n;
	static int[] ch, sum, arr;
	static boolean answer = false;
	
	public void solution(int L) {
		if(L == n) {
			int sum1 = 0;
			int sum2 = 0;
			for(int i=1; i<=10000; i++) {
				if(ch[i] == 1) sum1 += i;
				else if(ch[i] == 2) sum2 += i;
			}
			
			if(sum1 == sum2 && (sum1 != 0)) answer = true;
		} else {
			ch[arr[L]] = 1;
			solution(L+1);
			ch[arr[L]] = 2;
			solution(L+1);
		}	
	}
	
	public static void main(String[] args) {
		SubsetSameSum T = new SubsetSameSum();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n];
		ch = new int[10001];
		for(int i=0; i<n; i++) arr[i] = sc.nextInt();
		for(int x : arr) ch[x] = 2;
		T.solution(0);
		if(answer) System.out.println("YES");
		else System.out.println("NO");
		sc.close();
	}
}
