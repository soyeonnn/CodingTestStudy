class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int even = 0, odd = 0;
        for(int num : num_list) {
            if(num % 2 == 0) even++;
            else odd++;
        }
        answer[0] = even;
        answer[1] = odd;
        return answer;
    }
}