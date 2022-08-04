package array;

import java.util.Scanner;

public class GridMaxSum {

	public int solution(int n, int[][] arr) {
		int answer = 0;
		
		for(int i=0; i<n; i++) {
			int sumOne = 0, sumTwo = 0;
			for(int j=0; j<n; j++) {
				sumOne += arr[i][j];
				sumTwo += arr[j][i];
			}
			if(Math.max(sumOne, sumTwo) > answer) answer = Math.max(sumOne, sumTwo);
		}
		
		int sumThree = 0, sumFour = 0;
		for(int i=0; i<n; i++) {
			sumThree += arr[i][i];
			sumFour += arr[i][n-i-1];
		}
		if(Math.max(sumThree, sumFour) > answer) answer = Math.max(sumThree, sumFour);
		
		return answer;
	}
	
	public static void main(String[] args) {
		GridMaxSum T = new GridMaxSum();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
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
