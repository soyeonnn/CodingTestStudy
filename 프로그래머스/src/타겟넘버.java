class Solution {
    public static int[] ch;
    public static int answer, len;
    
    public void dfs(int n, int sum, int[] numbers, int target) {
        if(n == len) {
            if(sum == target) answer++;
        } else {
            dfs(n+1, (sum + (-1) * numbers[n]), numbers, target);
            dfs(n+1, sum + numbers[n], numbers, target);
        }
    }
    
    public int solution(int[] numbers, int target) {
        answer = 0;
        len = numbers.length;
        ch = new int[len];
        dfs(0, 0, numbers, target);
        return answer;
    }
}