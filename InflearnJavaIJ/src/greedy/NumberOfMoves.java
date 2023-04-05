package greedy;

public class NumberOfMoves {

    public int solution(int[] nums){
        int answer = 0;
        int[] thingCnt = new int[6];
        for(int num : nums) thingCnt[num]++;
        answer += thingCnt[4];
        answer += thingCnt[5];
        if(thingCnt[2] <= thingCnt[3]) {
            answer += thingCnt[2];
            answer += thingCnt[3] - thingCnt[2];
        } else {
            answer += thingCnt[3];
            answer += (thingCnt[2] - thingCnt[3]) / 2;
            answer += (thingCnt[2] - thingCnt[3]) % 2;
        }

        return answer;
    }

    public static void main(String[] args){
        NumberOfMoves T = new NumberOfMoves();
        System.out.println(T.solution(new int[]{2, 5, 3, 4, 2, 3}));
        System.out.println(T.solution(new int[]{2, 3, 4, 5}));
        System.out.println(T.solution(new int[]{3, 3, 3, 3, 3}));
        System.out.println(T.solution(new int[]{2, 2, 2, 2, 3}));
    }
}
