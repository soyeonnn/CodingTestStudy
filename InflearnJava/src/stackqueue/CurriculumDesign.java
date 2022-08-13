package stackqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CurriculumDesign {

	public String solution(String essSub, String mySub) {
		String answer = "YES";
		Queue<Character> Q1 = new LinkedList<>();
		Queue<Character> Q2 = new LinkedList<>();
		for(char x : essSub.toCharArray()) Q1.add(x);
		for(char x : mySub.toCharArray()) Q2.add(x);
		while(Q2.size() > 0) {
			char sub = Q2.poll();
			if(Q1.isEmpty()) return answer;
			if(sub == Q1.peek()) Q1.poll();
		}
		if(Q1.size() != 0) answer = "NO";
		return answer;
	}
	
	public static void main(String[] args) {
		CurriculumDesign T = new CurriculumDesign();
		Scanner sc = new Scanner(System.in);
		String essSub = sc.next();
		String mySub = sc.next();
		System.out.println(T.solution(essSub, mySub));
		sc.close();
	}
}
