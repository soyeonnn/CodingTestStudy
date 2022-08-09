package twopointersslidingwindow;

import java.util.Scanner;

public class SumConsecutiveNaturalNum {

	public int solution(int n) {
		int answer = 0, lt = 1, sum = 1;
		for(int rt=2; rt<n; rt++) {
			sum += rt;
			if(sum == n) answer++;
			while(sum >= n) {
				sum -= lt++;
				if(sum == n) answer++;
			}
		}	
		return answer;
	}
	
	public static void main(String[] args) {
		SumConsecutiveNaturalNum T = new SumConsecutiveNaturalNum();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(T.solution(n));
		sc.close();
	}
}
