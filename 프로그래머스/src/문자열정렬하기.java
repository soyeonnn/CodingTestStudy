import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(char c : my_string.toCharArray()) {
            if(Character.isDigit(c)) arr.add(Character.getNumericValue(c));
        }
        Collections.sort(arr);
        answer = arr.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}