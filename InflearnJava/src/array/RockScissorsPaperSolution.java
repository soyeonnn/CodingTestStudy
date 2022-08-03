package array;

import java.util.Scanner;

public class RockScissorsPaperSolution {
	
	public String solution(int n, int[] aInfo, int[] bInfo) {
		String answer = "";
		
		for(int i=0; i<n; i++) {
			if(aInfo[i] == bInfo[i]) answer += "D";
			else if(aInfo[i] == 1 && bInfo[i] == 3) answer += "A";
			else if(aInfo[i] == 2 && bInfo[i] == 1) answer += "A";
			else if(aInfo[i] == 3 && bInfo[i] == 2) answer += "A";
			else answer += "B";
		}
		return answer;
	}
	
	public static void main(String[] args) {
		RockScissorsPaperSolution T = new RockScissorsPaperSolution();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] aInfo = new int[n];
		int[] bInfo = new int[n];
		
		for(int i=0; i<n; i++) 
			aInfo[i] = sc.nextInt();	
		for(int i=0; i<n; i++) 
			bInfo[i] = sc.nextInt();
		
		for(char x: T.solution(n, aInfo, bInfo).toCharArray()) System.out.println(x);;

		sc.close();
	}
}
