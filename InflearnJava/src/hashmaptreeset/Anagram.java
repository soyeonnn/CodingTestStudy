package hashmaptreeset;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram {

	public String solution(String a, String b) {
		String answer = "YES";
		HashMap<Character, Integer> mapA = new HashMap<>();
		HashMap<Character, Integer> mapB = new HashMap<>();
		
		for(char x : a.toCharArray()) mapA.put(x, mapA.getOrDefault(x, 0)+1);
		for(char x : b.toCharArray()) mapB.put(x, mapB.getOrDefault(x, 0)+1);
		
		for(char key: mapA.keySet()) {
			if(mapA.get(key) != mapB.get(key)) answer = "NO";
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Anagram T = new Anagram();
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		System.out.println(T.solution(a, b));
		sc.close();
	}
}
