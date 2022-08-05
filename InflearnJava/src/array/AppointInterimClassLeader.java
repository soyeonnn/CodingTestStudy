package array;

import java.util.Scanner;

public class AppointInterimClassLeader {

	public int solution(int n, int[][] arr) {
		int answer = 0, max = -1;
		int[][] sameClass = new int[n][n];
		
		for(int cnt=0; cnt<5; cnt++) {
			for(int i=0; i<n-1; i++) {
				for(int j=i+1; j<n; j++) {
					if(arr[i][cnt] == arr[j][cnt]) {
						sameClass[i][j] = 1;
						sameClass[j][i] = 1;
					}
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			int sum = 0;
			for(int j=0; j<n; j++) {
				sum += sameClass[i][j];
			}
			if(sum > max) {
				max = sum;
				answer = i+1;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		AppointInterimClassLeader T = new AppointInterimClassLeader();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][5];
		for(int i=0; i<n; i++) {
			for(int j=0; j<5; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(T.solution(n, arr));
		sc.close();
	}
}
