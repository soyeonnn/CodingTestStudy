import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        ArrayList<Long> arr = new ArrayList<>();
        while(n > 0) {
            arr.add(n % 10);
            n /= 10;
        }
        Collections.sort(arr, Comparator.reverseOrder());
        String answerString = "";
        for(long num : arr) {
            answerString += String.valueOf(num);
        }
        answer = Long.valueOf(answerString);
        return answer;
    }
}