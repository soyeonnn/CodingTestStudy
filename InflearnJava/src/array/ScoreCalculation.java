package array;

import java.util.Scanner;

public class ScoreCalculation {

	public int solution(int n, int[] arr) {
		int answer = 0, score = 0;
		for(int s : arr) {
			if(s == 1) {
				score++;
				answer += score;
			} else score = 0;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		ScoreCalculation T = new ScoreCalculation();
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
