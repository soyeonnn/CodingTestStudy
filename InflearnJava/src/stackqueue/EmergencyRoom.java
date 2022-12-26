package stackqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 풀이X
public class EmergencyRoom {

	public int solution(int n, int m, int[] arr) {
		int answer = 0, patient = arr[m];
		Queue<Integer> Q = new LinkedList<>();
		for(int x : arr) Q.add(x);
		while(!Q.isEmpty()) {
			int popNum = Q.poll();
			boolean isMax = true;
			for(int i=0; i<Q.size(); i++) {     
				if(Q.peek() < popNum) Q.add(Q.poll());
				else {
					Q.add(popNum);
					isMax = false;
					break;
				}				
			}
			if(isMax && (patient == popNum)) return answer+1;
			else if(isMax && (patient != popNum)) answer++;
		}		
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
