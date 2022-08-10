package hashmaptreeset;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TypeOfSales {

	public ArrayList<Integer> solution(int n, int k, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		int lt = 0;
		for(int i=0; i<k-1; i++) map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		
		for(int rt=k-1; rt<n; rt++) {			
			map.put(arr[rt], map.getOrDefault(arr[rt], 0)+1);
			answer.add(map.size());
			if(map.get(arr[lt]) == 1) map.remove(arr[lt]);
			else map.put(arr[lt], map.get(arr[lt])-1);					
			lt++;
		}	
		return answer;
	}
	
	public static void main(String[] args) {
		TypeOfSales T = new TypeOfSales();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = sc.nextInt();
		for(int x : T.solution(n, k, arr)) System.out.print(x + " ");
		sc.close();
	}
}
