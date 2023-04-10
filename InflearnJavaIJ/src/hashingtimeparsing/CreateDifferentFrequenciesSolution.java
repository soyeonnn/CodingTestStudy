package hashingtimeparsing;

import java.util.*;

public class CreateDifferentFrequenciesSolution {

    public int solution(String s){
        int answer = 0;
        HashMap<Character, Integer> sH = new HashMap<>();
        HashSet<Integer> ch = new HashSet<>();
        for(char x : s.toCharArray()){
            sH.put(x, sH.getOrDefault(x, 0) + 1);
        }
        for(char key : sH.keySet()){
            while(ch.contains(sH.get(key))){
                answer++;
                sH.put(key, sH.get(key) - 1);
            }
            if(sH.get(key) == 0) continue;
            ch.add(sH.get(key));
        }
        return answer;
    }

    public static void main(String[] args){
        CreateDifferentFrequenciesSolution T = new CreateDifferentFrequenciesSolution();
        System.out.println(T.solution("aaabbbcc"));
        System.out.println(T.solution("aaabbc"));
        System.out.println(T.solution("aebbbbc"));
        System.out.println(T.solution("aaabbbcccde"));
        System.out.println(T.solution("aaabbbcccdddeeeeeff"));
    }

}
