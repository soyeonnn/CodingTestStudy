package bfs;

import java.util.*;

public class TileJump {

    public int solution(int[] nums){
        int answer = 0;
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        int cur = 0;
        for(int i=1; i<=nums[0]; i++) {
            pQ.add(cur+i);
        }
        while(!pQ.isEmpty()) {
            if(cur >= nums.length-1) break;
            int next = pQ.poll();
            if(next > cur) answer++;
            cur = next;
            for(int i=1; i<=nums[cur]; i++) {
                if(cur+i < nums.length && nums[cur+i] != 0) pQ.add(cur+i);
            }
        }
        if(cur < nums.length-1) answer = -1;
        return answer;
    }

    public static void main(String[] args){
        TileJump T = new TileJump();
        System.out.println(T.solution(new int[]{2, 2, 1, 2, 1, 1}));
        System.out.println(T.solution(new int[]{1, 0, 1, 1, 3, 1, 2, 1}));
        System.out.println(T.solution(new int[]{2, 3, 1, 0, 1, 1, 2, 3, 1, 5, 1, 3, 1}));
        System.out.println(T.solution(new int[]{1, 2, 1, 2, 1, 2, 1, 1, 3, 1, 2, 1}));
        System.out.println(T.solution(new int[]{1, 3, 2, 1, 1, 2, 3, 1, 3, 1, 2, 3, 5, 1, 5, 1, 2, 1, 1}));
    }

}
