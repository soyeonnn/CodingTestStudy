package hashingtimeparsing;

import java.util.*;

public class MakeSameFrequency {

    public int[] solution(String s){
        int[] answer = new int[5];
        int max = Integer.MIN_VALUE;
        HashMap<Character, Integer> hM = new HashMap<>();

        // 문자 빈도수 hashmap에 넣기
        for(char c : s.toCharArray()) {
            hM.put(c, hM.getOrDefault(c, 0)+1);
        }

        // 빈도수가 제일 높은 것 찾기
        for(char c : hM.keySet()) {
            max = Math.max(max, hM.get(c));
        }

        // 같은 빈도수 만들기
        for(int i=0; i<5; i++) {
            char c = (char)(i+97);
            if(hM.containsKey(c)) answer[i] = max - hM.get(c);
            else answer[i] = max;
        }
        return answer;
    }

    public static void main(String[] args){
        MakeSameFrequency T = new MakeSameFrequency();
        System.out.println(Arrays.toString(T.solution("aaabc")));
        System.out.println(Arrays.toString(T.solution("aabb")));
        System.out.println(Arrays.toString(T.solution("abcde")));
        System.out.println(Arrays.toString(T.solution("abcdeabc")));
        System.out.println(Arrays.toString(T.solution("abbccddee")));
    }
}
