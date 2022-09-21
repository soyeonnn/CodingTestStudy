package conditional;

import java.util.Scanner;

public class S14681 {

	public int solution(int x, int y) {
		int answer = 4;
		if(x > 0 && y > 0) answer = 1;
		else if(x > 0 && y < 0) answer = 4;
		else if(x < 0 && y > 0) answer = 2;
		else answer = 3;
		return answer;
	}
	
	public static void main(String args[]) {
		S14681 T = new S14681();
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println(T.solution(x, y));
		sc.close();
	}
}
