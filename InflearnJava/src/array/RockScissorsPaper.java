package array;

import java.util.Scanner;

public class RockScissorsPaper {

	public char[] solution(int n, int[] aInfo, int[] bInfo) {
		char[] answer = new char[n];
		
		for(int i=0; i<n; i++) {
			if(aInfo[i] == bInfo[i]) answer[i] = 'D';
			else {
				if(aInfo[i] == 1 && bInfo[i] == 3) answer[i] = 'A';
				else if(aInfo[i] == 2 && bInfo[i] == 1) answer[i] = 'A';
				else if(aInfo[i] == 3 && bInfo[i] == 2) answer[i] = 'A';
				else answer[i] = 'B';
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		RockScissorsPaper T = new RockScissorsPaper();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] aInfo = new int[n];
		int[] bInfo = new int[n];
		
		for(int i=0; i<n; i++) 
			aInfo[i] = sc.nextInt();	
		for(int i=0; i<n; i++) 
			bInfo[i] = sc.nextInt();
		
		for(char win : T.solution(n, aInfo, bInfo))
			System.out.println(win);
		
		sc.close();
	}
}
