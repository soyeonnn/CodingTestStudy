package simulationimplementation;

public class MaxLengthBitonic {

    public int solution(int[] nums){
        int answer = 0;
        int len = 1;
        boolean isPlus = true;
        for(int i=0; i<nums.length-1; i++) {
            if(nums[i] == nums[i+1]) continue;
            if(isPlus) {
                if(nums[i] > nums[i+1] && len == 1) continue;
                if(nums[i] > nums[i+1]) isPlus = false;
                len++;
            } else {
                if(nums[i] < nums[i+1]) {
                    answer = Math.max(answer, len);
                    len = 1;
                    i--;
                    isPlus = true;
                } else {
                    len++;
                }
            }
        }
        answer = Math.max(answer, len);
        return answer;
    }

    public static void main(String[] args){
        MaxLengthBitonic T = new MaxLengthBitonic();
        System.out.println(T.solution(new int[]{1, 2, 1, 2, 3, 2, 1}));
        System.out.println(T.solution(new int[]{1, 1, 2, 3, 5, 7, 4, 3, 1, 2}));
        System.out.println(T.solution(new int[]{3, 2, 1, 3, 2, 4, 6, 7, 3, 1}));
        System.out.println(T.solution(new int[]{1, 3, 1, 2, 1, 5, 3, 2, 1, 1}));
    }
}
