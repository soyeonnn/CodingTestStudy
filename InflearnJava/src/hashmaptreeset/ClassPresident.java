package hashmaptreeset;

import java.util.Scanner;

public class ClassPresident {

	public char solution(int n, char[] arr) {
		char answer = 'A';
		int[] voteResult = new int[5];
		int maxVote = 0, presidentNum = 0;
		
		for(int i=0; i<n; i++) {
			if(arr[i] == 'A') voteResult[0]++;
			else if(arr[i] == 'B') voteResult[1]++;
			else if(arr[i] == 'C') voteResult[2]++;
			else if(arr[i] == 'D') voteResult[3]++;
			else if(arr[i] == 'E') voteResult[4]++;
		}
		
		for(int i=0; i<5; i++) {
			if(maxVote < voteResult[i]) {
				maxVote = voteResult[i];
				presidentNum = i;
			}
		}
		
		if(presidentNum == 0) answer = 'A';
		else if(presidentNum == 1) answer = 'B';
		else if(presidentNum == 2) answer = 'C';
		else if(presidentNum == 3) answer = 'D';
		else if(presidentNum == 4) answer = 'E';
		
		return answer;
	}
	
	public static void main(String[] args) {
		ClassPresident T = new ClassPresident();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] arr = new char[n];
		String vote = sc.next();
		arr = vote.toCharArray();
		System.out.println(T.solution(n, arr));
		sc.close();
	}
}
