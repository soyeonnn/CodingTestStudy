package sortingsearching;

import java.util.Scanner;

public class Mischief {

	public int[] solution(int n, int[] arr) {
		int[] answer = new int[2];
		for(int i=n-1; i>0; i--) {
			if(arr[i-1] > arr[i]) {
				answer[1] = i+1;
				int fIndex = i-2;
				while(fIndex > 0) {
					if(arr[fIndex-1] <= arr[fIndex]) fIndex--;
					else {
						answer[0] = fIndex;
						return answer;
					}
					
					if(answer[0] == 0) {
						for(int j=0; j<n; j++) {
							if(arr[j] == arr[answer[1]-1]) {
								answer[0] = j+2;
								break;
							}							
						}
					}
				}		
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Mischief T = new Mischief();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = sc.nextInt();
		for(int x : T.solution(n, arr)) System.out.print(x + " ");
		sc.close();
	}
}
