package array;

import java.util.Scanner;

public class StudentWhoSeeSolution {

	public int solution(int n, int[] arr) {
		int answer = 1, max = arr[0];
		for(int i=1; i<n; i++) {
			if(arr[i] > max) {
				max = arr[i];
				answer++;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		StudentWhoSeeSolution T = new StudentWhoSeeSolution();
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
