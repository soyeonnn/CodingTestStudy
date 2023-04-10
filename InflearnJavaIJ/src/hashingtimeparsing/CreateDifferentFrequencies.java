package hashingtimeparsing;

import java.util.*;

public class CreateDifferentFrequencies {
    public int solution(String s){
        int answer = 0;
        Map<Character, Integer> hM = new TreeMap<>();
        for(char c : s.toCharArray()) {
            hM.put(c, hM.getOrDefault(c, 0) + 1);
        }

        List<Character> keySet = new ArrayList<>(hM.keySet());
        keySet.sort((o1, o2) -> hM.get(o2) - hM.get(o1));

        int[] cntCh = new int[10001];
        for(char c : keySet) {
            int cnt = hM.get(c);
            while(cntCh[cnt] != 0 && cnt > 0) {
                cnt--;
                answer++;
            }
            cntCh[cnt] = 1;
        }



        return answer;
    }

    public static void main(String[] args){
        CreateDifferentFrequencies T = new CreateDifferentFrequencies();
        System.out.println(T.solution("aaabbbcc"));
        System.out.println(T.solution("aaabbc"));
        System.out.println(T.solution("aebbbbc"));
        System.out.println(T.solution("aaabbbcccde"));
        System.out.println(T.solution("aaabbbcccdddeeeeeff"));
    }

}
