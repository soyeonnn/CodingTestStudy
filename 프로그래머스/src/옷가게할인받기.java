class Solution {
    public int solution(int price) {
        int answer = 0;
        double discountPrice = 0;
        
        if(price >= 500000) discountPrice = price * 0.80;
        else if(price >= 300000) discountPrice = price * 0.90;
        else if(price >= 100000) discountPrice = price * 0.95;
        else discountPrice = price;
        
        answer = (int)discountPrice;
        return answer;
    }
}