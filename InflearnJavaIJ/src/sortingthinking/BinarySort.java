package sortingthinking;

import java.util.*;
public class BinarySort {

    public int[] solution(int[] nums){
        int[] answer = new int[nums.length];
        ArrayList<int[]> arr = new ArrayList<>();
        for(int num : nums) {
            String binaryNum = Integer.toBinaryString(num);
            int oneCnt = binaryNum.length() - binaryNum.replaceAll("1", "").length();
            arr.add(new int[] {num, oneCnt});
        }

        Collections.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] != o2[1]) return o1[1] - o2[1];
                return o1[0] - o2[0];
            }
        });

        for(int i=0; i<arr.size(); i++) {
            answer[i] = arr.get(i)[0];
        }

        return answer;
    }

    public static void main(String[] args){
        BinarySort T = new BinarySort();
        System.out.println(Arrays.toString(T.solution(new int[]{5, 6, 7, 8, 9})));
        System.out.println(Arrays.toString(T.solution(new int[]{5, 4, 3, 2, 1})));
        System.out.println(Arrays.toString(T.solution(new int[]{12, 5, 7, 23, 45, 21, 17})));
    }
}
