package hashingtimeparsing;

import java.util.*;

public class FirstCharUsedOnce {
    public int solution(String s){
        int answer = 0;
        HashMap<Character, Integer> hM = new HashMap<>();
        for(char c : s.toCharArray()) {
            if(hM.containsKey(c)) hM.put(c, hM.get(c)+1);
            else hM.put(c, 1);
        }
        for(int i=0; i<s.length(); i++) {
            if(hM.get(s.charAt(i)) == 1) {
                answer = i+1;
                break;
            }
        }
        if(answer == 0) answer = -1;
        return answer;
    }

    public static void main(String[] args){
        FirstCharUsedOnce T = new FirstCharUsedOnce();
        System.out.println(T.solution("statitsics"));
        System.out.println(T.solution("aabb"));
        System.out.println(T.solution("stringshowtime"));
        System.out.println(T.solution("abcdeabcdfg"));
    }

}
