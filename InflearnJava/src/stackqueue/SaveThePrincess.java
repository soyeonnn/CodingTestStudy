package stackqueue;

import java.util.Scanner;
import java.util.ArrayList;

public class SaveThePrincess {

	public int solution(int n, int k) {
		int answer = 0, index = 0, num = 1;
		ArrayList<Integer> prince = new ArrayList<>();
		for(int i=1; i<=n; i++) prince.add(i);
		while(prince.size() > 1) {
			if(num == k) {
				prince.remove(index);
				num = 1;
			}
			else {
				index = (index+1) % prince.size();
				num++;
			}
		}
		answer = prince.get(0);
		return answer;
	}
	
	public static void main(String[] args) {
		SaveThePrincess T = new SaveThePrincess();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		System.out.println(T.solution(n, k));
		sc.close();
	}
}
