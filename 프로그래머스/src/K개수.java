class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String kStr = String.valueOf(k);
        
        for(int num=i; num<=j; num++) {
            String numStr = String.valueOf(num);
            answer += numStr.length() - numStr.replaceAll(kStr, "").length();
        }
        return answer;
    }
}