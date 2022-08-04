package array;

import java.util.Scanner;

public class GetRank {

	public int[] solution(int n, int[] arr) {
		int[] answer = new int[n];
		int rank = 0, preMax = -1, preRank = 1;
		
		for(int i=0; i<n; i++) {
			int max = -1, maxIndex = 0;
			for(int j=0; j<n; j++) {
				if(arr[j] > max && answer[j] == 0) {
					max = arr[j];
					maxIndex = j;
				}
			}
			if(preMax == max) {
				answer[maxIndex] = preRank;
				rank++;
			}
			else {
				rank++;
				answer[maxIndex] = rank;
				preRank = rank;
			}
			preMax = max;
			
		}
		return answer;
	}
	
	public static void main(String[] args) {
		GetRank T = new GetRank();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		for(int x : T.solution(n, arr)) {
			System.out.print(x + " ");
		}
		sc.close();
	}
}
