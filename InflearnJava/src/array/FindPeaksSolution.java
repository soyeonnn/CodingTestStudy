package array;

import java.util.Scanner;

public class FindPeaksSolution {

	int[] dx = {0, 0, -1, 1};
	int[] dy = {1, -1, 0, 0};
	
	public int solution(int n, int[][] arr) {
		int answer = 0;

		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				boolean flag = true;
				for(int k=0; k<4; k++) {
					int nx = i + dx[k];
					int ny = j + dy[k];
					if(nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] >= arr[i][j]) {
						flag = false;
						break;
					}
				}
				if(flag) answer++;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		FindPeaksSolution T = new FindPeaksSolution();
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
