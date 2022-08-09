package twopointersslidingwindow;

import java.util.Scanner;

public class SumConsecutiveNaturalNumSolution2 {

	public int solution(int n) {
		int answer = 0, cnt = 1;
		n--;
		while(n>0) {
			cnt++;
			n = n-cnt;
			if(n%cnt == 0) answer++;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		SumConsecutiveNaturalNumSolution2 T = new SumConsecutiveNaturalNumSolution2();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(T.solution(n));
		sc.close();
	}
}
