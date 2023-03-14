import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        answer = Math.max(answer = numbers[numbers.length-1] * numbers[numbers.length-2], numbers[0] * numbers[1]);
        return answer;
    }
}