import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer;
        Set<Integer> set = new HashSet<>();
        int div = 2;
        while(n > 1) {
            if(n % div == 0) {
                set.add(div);
                n /= div;
                div = 2;
                continue;
            }
            div++;
        }
        Integer[] array = set.toArray(new Integer[set.size()]);
        answer = new int[array.length];
        for(int i=0; i<array.length; i++) answer[i] = array[i];
        Arrays.sort(answer);
        return answer;
    }
}