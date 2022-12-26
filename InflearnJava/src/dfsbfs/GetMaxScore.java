package dfsbfs;

import java.util.ArrayList;
import java.util.Scanner;

class Problem {
	int score;
	int time;
	
	public Problem(int score, int time) {
		super();
		this.score = score;
		this.time = time;
	}
}

public class GetMaxScore {

	static int n, m, answer = Integer.MIN_VALUE;
	
	public void solution(int L, int scoreSum, int timeSum, ArrayList<Problem> arr) {
		if(timeSum > m) return;
		if(L == n) {
			answer = Math.max(scoreSum, answer);
		} else {
			solution(L+1, scoreSum+arr.get(L).score, timeSum+arr.get(L).time, arr);
			solution(L+1, scoreSum, timeSum, arr);
		}
	}
	
	public static void main(String[] args) {
		GetMaxScore T = new GetMaxScore();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		ArrayList<Problem> arr = new ArrayList<>();
		for(int i=0; i<n; i++) arr.add(new Problem(sc.nextInt(), sc.nextInt()));
		T.solution(0, 0, 0, arr);
		System.out.println(answer);
		sc.close();
	}
}
