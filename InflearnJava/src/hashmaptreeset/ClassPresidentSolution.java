package hashmaptreeset;

import java.util.HashMap;
import java.util.Scanner;

public class ClassPresidentSolution {

	public char solution(int n, String arr) {
		char answer = ' ';
		HashMap<Character, Integer> map = new HashMap<>();
		for(char x : arr.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		
		// 특정 key가 있는지 확인하는 방법(풀이와는 상관 없음!) - 존재하면 true가 return 된다.
		// System.out.println(map.containsKey('A'));
		
		// key의 개수 알아내기
		// System.out.println(map.size());		
		
		// 특정 key 삭제하기
		// System.out.println(map.remove('A'));
		
		int max = Integer.MIN_VALUE;
		for(char key : map.keySet()) {
			if(map.get(key) > max) {
				max = map.get(key);
				answer = key;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		ClassPresidentSolution T = new ClassPresidentSolution();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		System.out.println(T.solution(n, str));
		sc.close();
	}
}
