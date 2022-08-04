package array;

import java.util.Scanner;

public class FindPeaks {

	public int solution(int n, int[][] arr) {
		int answer = 0;
		int[] dx = {0, 0, -1, 1};
		int[] dy = {1, -1, 0, 0};
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				boolean isPeak = true;
				for(int k=0; k<4; k++) {
					if(i+dx[k] < 0 || i+dx[k] >= n || j+dy[k] < 0 || j+dy[k] >= n) continue;
					else if(arr[i+dx[k]][j+dy[k]] >= arr[i][j]) isPeak = false;
				}
				if(isPeak) answer++;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		FindPeaks T = new FindPeaks();
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int[][] arr = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(T.solution(n, arr));
		sc.close();
	}
}
