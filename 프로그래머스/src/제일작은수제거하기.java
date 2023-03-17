import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> tmpArr = new ArrayList<>();
        for(int n : arr) tmpArr.add(n);
        tmpArr.remove(tmpArr.indexOf(Collections.min(tmpArr)));
        if(tmpArr.size() == 0) tmpArr.add(-1);
        answer = tmpArr.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}