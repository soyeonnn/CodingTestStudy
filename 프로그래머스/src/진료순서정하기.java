import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        ArrayList<Integer> emergencyArr = new ArrayList<Integer>();
        for(int num : emergency) emergencyArr.add(num);
        
        Collections.sort(emergencyArr, Collections.reverseOrder());
        
        int rank = 1;
        for(int i=0; i<emergencyArr.size(); i++) {
            int tmpNum = emergencyArr.get(i);
            for(int j=0; j<emergency.length; j++) {
                if(emergency[j] == tmpNum) {
                    answer[j] = rank;
                    rank++;
                    break;
                }
            }
        }
        return answer;
    }
}