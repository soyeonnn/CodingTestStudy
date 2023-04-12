import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer;
        ArrayList<Integer> tmp = new ArrayList<>();
        tmp.add(arr[0]);
        for(int i=1; i<arr.length; i++) {
            if(tmp.get(tmp.size()-1) != arr[i]) tmp.add(arr[i]);
        }
        
        answer = tmp.stream().mapToInt(i -> i).toArray();

        return answer;
    }
}