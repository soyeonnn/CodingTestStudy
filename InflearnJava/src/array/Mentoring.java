package array;

import java.util.Scanner;

public class Mentoring {

	public int solution(int n, int m, int[][] arr) {
		int solution = 0;
		boolean[][] mentor = new boolean[n+1][n+1];
		

		for(int cnt=1; cnt<=m; cnt++) {
			for(int i=n; i>0; i--) {
				for(int j=i; j>0; j--) {
					mentor[arr[cnt][i]][arr[cnt][j]] = true;
				}
			}
		}
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(!mentor[i][j]) solution++;
			}
		}
		return solution;
	}
	
	public static void main(String[] args) {
		Mentoring T = new Mentoring();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[m+1][n+1];
		for(int i=1; i<=m; i++) {
			for(int j=1; j<=n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(T.solution(n, m, arr));
		sc.close();
	}
}
