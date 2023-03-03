import java.util.stream.*;
import java.util.*;

class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        IntStream numbersStream = IntStream.of(numbers);
        OptionalDouble obj = numbersStream.average();
        answer = obj.getAsDouble();
        return answer;
    }
}
