package hashingtimeparsing;

import java.util.*;
public class NegativeSubsequence {

    public int solution(int[] nums, int m){
        int answer = 0;
        for(int i=0; i<nums.length; i++) {
            for(int j=i; j<nums.length; j++) {
                if(Arrays.stream(Arrays.copyOfRange(nums, i, j+1)).sum() == m) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        NegativeSubsequence T = new NegativeSubsequence();
        System.out.println(T.solution(new int[]{2, 2, 3, -1, -1, -1, 3, 1, 1}, 5));
        System.out.println(T.solution(new int[]{1, 2, 3, -3, 1, 2, 2, -3}, 5));
        System.out.println(T.solution(new int[]{1, 2, 3, -3, 1, 2}, 3));
        System.out.println(T.solution(new int[]{-1, 0, 1}, 0));
        System.out.println(T.solution(new int[]{-1, -1, -1, 1}, 0));
    }
}
