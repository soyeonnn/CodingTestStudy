import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1; i<=n/2; i++) {
            if(n % i == 0) arr.add(i);
        }
        arr.add(n);
        answer = arr.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}