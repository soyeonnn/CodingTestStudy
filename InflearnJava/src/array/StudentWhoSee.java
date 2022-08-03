package array;

import java.util.Scanner;

public class StudentWhoSee {

	public int solution(int n, int[] arr) {
		int answer = 0, max = 0;
		for(int x : arr) {
			if(x > max) {
				max = x;
				answer++;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		StudentWhoSee T = new StudentWhoSee();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(T.solution(n, arr));
		sc.close();
	}
}
