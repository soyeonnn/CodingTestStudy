package sortingsearching;

import java.util.Scanner;

public class CoordinateAlignment {

	public int[][] solution(int n, int[][] arr) {
		int tmp;
		
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-i-1; j++) {
				if(arr[j][0] == arr[j+1][0]) {
					if(arr[j][1] > arr[j+1][1]) {
						tmp = arr[j][0];
						arr[j][0] = arr[j+1][0];
						arr[j+1][0] = tmp;
						tmp = arr[j][1];
						arr[j][1] = arr[j+1][1];
						arr[j+1][1] = tmp;
					}
				} else if(arr[j][0] > arr[j+1][0]) {
					tmp = arr[j][0];
					arr[j][0] = arr[j+1][0];
					arr[j+1][0] = tmp;
					tmp = arr[j][1];
					arr[j][1] = arr[j+1][1];
					arr[j+1][1] = tmp;
				}
			}		
		}
		return arr;
	}
	
	public static void main(String[] args) {
		CoordinateAlignment T = new CoordinateAlignment();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][2];
		for(int i=0; i<n; i++) {
			for(int j=0; j<2; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int[][] answer = T.solution(n, arr);
		for(int i=0; i<n; i++) {
			 System.out.println(answer[i][0] + " " + answer[i][1]);
		}
		sc.close();
	}
}
