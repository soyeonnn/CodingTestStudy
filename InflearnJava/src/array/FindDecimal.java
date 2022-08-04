package array;

import java.util.Scanner;

public class FindDecimal {

	public int solution(int n) {
		int answer = 0;
		int[] arr = new int[n+1];
		
		for(int i=2; i<=n; i++) {
			if(arr[i] == 0) {
				answer++;
				int delNum = 2*i;
				while(delNum <= n) {
					arr[delNum] = 1;
					delNum += i;
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		FindDecimal T = new FindDecimal();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(T.solution(n));
		sc.close();
	}
}
