package greedy;

import java.util.*;
public class Titanic {

    public int solution(int[] nums, int m){
        int answer = 0;
        int len = nums.length;
        int i=0, j=len-1;
        Arrays.sort(nums);
        while(i <= j) {
            if(nums[i] + nums[j] <= m) i++;
            j--;
            answer++;
        }
        return answer;
    }

    public static void main(String[] args){
        Titanic T = new Titanic();
        System.out.println(T.solution(new int[]{90, 50, 70, 100, 60}, 140));
        System.out.println(T.solution(new int[]{86, 95, 107, 67, 38, 49, 116, 22, 78, 53}, 150));
        System.out.println(T.solution(new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90}, 100));
        System.out.println(T.solution(new int[]{68, 72, 30, 105, 55, 115, 36, 67, 119, 111, 95, 24, 25, 80, 55, 85, 75, 83, 21, 81}, 120));
    }
}
