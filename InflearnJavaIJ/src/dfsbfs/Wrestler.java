package dfsbfs;

import java.util.Scanner;

public class Wrestler {

    public int solution(int n, int[] height, int[] weight) {
        int answer = 0;
        for(int i=0; i<n; i++) {
            int curHeight = height[i];
            int curWeight = weight[i];
            boolean flag = true;
            for(int j=0; j<n; j++) {
                if(curWeight < weight[j] && curHeight < height[j]) flag = false;
            }
            if(flag) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Wrestler T = new Wrestler();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] height = new int[n];
        int[] weight = new int[n];

        for(int i=0; i<n; i++) {
            height[i] = sc.nextInt();
            weight[i] = sc.nextInt();
        }

        System.out.println(T.solution(n, height, weight));

    }
}
