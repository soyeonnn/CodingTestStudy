import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> divNum = new ArrayList<>();
        for(int num : arr) {
            if(num % divisor == 0) divNum.add(num);
        }
        Collections.sort(divNum);
        if(divNum.size() == 0) divNum.add(-1);
        answer = divNum.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}