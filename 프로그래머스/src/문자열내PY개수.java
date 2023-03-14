class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toUpperCase();
        int pCnt = 0, yCnt = 0;
        for(char c : s.toCharArray()) {
            if(c == 'P') pCnt++;
            else if(c == 'Y') yCnt++;
        }
        if(pCnt != yCnt) answer = false;
        return answer;
    }
}