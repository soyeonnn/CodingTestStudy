package utilizedatastructure;

import java.util.*;

public class MaxLenSequence {

    public int solution(int[] nums){
        int answer = Integer.MIN_VALUE;
        ArrayList<Integer> numsArr = new ArrayList<>();
        int len = 1;
        for(int num : nums) {
            if(!numsArr.contains(num)) numsArr.add(num);
        }
        Collections.sort(numsArr);
        for(int i=0; i<numsArr.size()-1; i++) {
            if(numsArr.get(i)+1 == numsArr.get(i+1)) len++;
            else {
                answer = Math.max(answer, len);
                len = 1;
            }
        }
        answer = Math.max(answer, len);
        return answer;
    }

    public static void main(String[] args){
        MaxLenSequence T = new MaxLenSequence();
        System.out.println(T.solution(new int[]{8, 1, 9, 3, 10, 2, 4, 0, 2, 3}));
        System.out.println(T.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 0, 0, 0, 0}));
        System.out.println(T.solution(new int[]{3, 3, 3, 3, 3, 3, 3, 3}));
        System.out.println(T.solution(new int[]{-3, -1, -2, 0, 3, 3, 5, 6, 2, 2, 1, 1}));
        System.out.println(T.solution(new int[]{-5, -3, -1, -4, 3, 3, 5, 6, 2, 2, 1, 1, 7}));
        System.out.println(T.solution(new int[]{5, 6, 7, 8, 9, 0, 1}));
    }
}
