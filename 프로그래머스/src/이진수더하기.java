class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int bin1Num = Integer.parseInt(bin1, 2);
        int bin2Num = Integer.parseInt(bin2, 2);
        answer = Integer.toBinaryString(bin1Num + bin2Num);
        return answer;
    }
}