import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1; i<=n; i++) {
            if(i%2 != 0) arr.add(i); 
        }
        
        answer = arr.stream().mapToInt(i -> i).toArray();
        
        return answer;
        
        // 다른 방법
        // return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
    }
}