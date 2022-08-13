package stackqueue;

import java.util.Scanner;

public class EmergencyRoom {

	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		
		return answer;
	}
	
	public static void main(String[] args) {
		EmergencyRoom T = new EmergencyRoom();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = sc.nextInt();
		System.out.println(T.solution(n, m, arr));
		sc.close();
	}
}
