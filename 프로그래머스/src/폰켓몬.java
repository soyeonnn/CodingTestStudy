import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashMap<Integer, Integer> hM = new HashMap<>();
        for(int num : nums) {
            hM.put(num, hM.getOrDefault(num, 0) + 1);
        }
        
        int bringNum = nums.length / 2;
        if(bringNum > hM.size()) answer = hM.size();
        else answer = bringNum;
        
        return answer;
    }
}