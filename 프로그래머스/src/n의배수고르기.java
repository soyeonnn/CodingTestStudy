import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        List<Integer> ans = new ArrayList<Integer>();
        for(int num : numlist) {
            if(num % n == 0) ans.add(num);
        }
        answer = ans.stream().mapToInt(i -> i).toArray();
        return answer;

        // 다른 답
        // return Arrays.stream(numList).filter(value -> value % n == 0).toArray();
    }
}