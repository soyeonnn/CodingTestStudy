package greedy;

import java.util.*;
class Flower implements Comparable<Flower> {
    int plantTime;
    int growTime;

    public Flower(int plantTime, int growTime) {
        this.plantTime = plantTime;
        this.growTime = growTime;
    }

    @Override
    public int compareTo(Flower o) {
        if(o.growTime == this.growTime) return o.plantTime - this.plantTime;
        else return o.growTime - this.growTime;
    }
}
public class ShortestTimeToBloom {

    public int solution(int[] plantTime, int[] growTime){
        int answer = Integer.MIN_VALUE;
        Flower[] flowers = new Flower[plantTime.length];
        int[] flowerBed = new int[flowers.length];
        for(int i=0; i<plantTime.length; i++) {
            flowers[i] = new Flower(plantTime[i], growTime[i]);
        }
        Arrays.sort(flowers);

        // 꽃씨 심기
        flowerBed[0] = flowers[0].plantTime;
        for(int i=1; i<plantTime.length; i++) {
            flowerBed[i] = flowerBed[i-1] + flowers[i].plantTime;
        }

        // 꽃씨 성장
        for(int i=0; i<plantTime.length; i++) {
            flowerBed[i] += flowers[i].growTime;
        }

        // 최단 시간 구하기
        for(int i=0; i<plantTime.length; i++) {
            answer = Math.max(answer, flowerBed[i]);
        }
        return answer;
    }

    public static void main(String[] args){
        ShortestTimeToBloom T = new ShortestTimeToBloom();
        System.out.println(T.solution(new int[]{1, 3, 2}, new int[]{2, 3, 2}));
        System.out.println(T.solution(new int[]{2, 1, 4, 3}, new int[]{2, 5, 3, 1}));
        System.out.println(T.solution(new int[]{1, 1, 1}, new int[]{7, 3, 2}));
        System.out.println(T.solution(new int[]{5, 7, 10, 15, 7, 3, 5}, new int[]{6, 7, 2, 10, 15, 6, 7}));
        System.out.println(T.solution(new int[]{1, 2, 3, 4, 5, 6, 7}, new int[]{7, 5, 4, 3, 2, 1, 6}));
    }
}
