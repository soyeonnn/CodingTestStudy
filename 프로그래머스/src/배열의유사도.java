import java.util.*;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        List<String> strList = new ArrayList<String>(Arrays.asList(s1));
        for(String s : s2) {
            if(strList.contains(s)) answer++;
        }
        return answer;
    }
}