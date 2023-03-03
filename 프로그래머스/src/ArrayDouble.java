import java.util.stream.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        IntStream stream = IntStream.of(numbers);
        answer = stream.map(i -> i*=2).toArray();
        return answer;
    }
}
