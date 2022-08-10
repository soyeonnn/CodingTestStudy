package hashmaptreeset;

import java.util.HashMap;
import java.util.Scanner;

public class FindAllAnagrams {
	
	public int solution(String s1, String s2) {
		int answer = 0, strLen = s2.length(), lt = 0;
		HashMap<Character, Integer> s1Map = new HashMap<>();
		HashMap<Character, Integer> s2Map = new HashMap<>();
		
		for(char x : s2.toCharArray()) s2Map.put(x, s2Map.getOrDefault(x, 0)+1);
		for(int i=0; i<strLen-1; i++) s1Map.put(s1.charAt(i), s1Map.getOrDefault(s1.charAt(i), 0)+1);
		
		for(int rt=strLen-1; rt<s1.length(); rt++) {
			s1Map.put(s1.charAt(rt), s1Map.getOrDefault(s1.charAt(rt), 0)+1);
			
			boolean sameFlag = true;
			for(char x : s2Map.keySet()) if(s2Map.get(x) != s1Map.get(x)) sameFlag = false;	
			if(sameFlag) answer++;
			
			if(s1Map.get(s1.charAt(lt)) == 1) s1Map.remove(s1.charAt(lt));
			else s1Map.put(s1.charAt(lt), s1Map.get(s1.charAt(lt))-1);					
			lt++;
		}		
		return answer;
	}
	
	public static void main(String[] args) {
		FindAllAnagrams T = new FindAllAnagrams();
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		System.out.println(T.solution(a, b));
		sc.close();
	}
}
