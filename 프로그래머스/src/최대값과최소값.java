import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] splitNum = s.split(" ");
        int[] numArr = new int[splitNum.length];
        for(int i=0; i<splitNum.length; i++) {
            numArr[i] = Integer.parseInt(splitNum[i]);
        } 
        Arrays.sort(numArr);
        answer += String.valueOf(numArr[0] + " ");
        answer += String.valueOf(numArr[numArr.length-1]);
        return answer;
    }
}