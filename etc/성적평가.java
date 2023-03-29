import java.util.*;
import java.io.*;


public class Main
{
    public int[] getGrade(int n, int[] arr) {
        int[] result = new int[n];
        int preMax = Integer.MIN_VALUE, preMaxIndex = 0;

        for(int i=1; i<=n; i++) {
            int maxIndex = 0;
            int max = Integer.MIN_VALUE;
            for(int j=0; j<n; j++) {
                if(result[j] == 0 && arr[j] > max) {
                    max = arr[j];
                    maxIndex = j; 
                }
            }
            if(preMax == max) result[maxIndex] = result[preMaxIndex];
            else result[maxIndex] = i;
            preMax = max;
            preMaxIndex = maxIndex;
        }

        return result;
    }

    public int[] getTotalGrade(int n, int[] arr) {
        int[] result = new int[n];
        int preMin = Integer.MAX_VALUE, preMinIndex = 0;

        for(int i=1; i<=n; i++) {
            int minIndex = 0;
            int min = Integer.MAX_VALUE;
            for(int j=0; j<n; j++) {
                if(result[j] == 0 && arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            if(preMin == min) result[minIndex] = result[preMinIndex];
            else result[minIndex] = i;
            preMin = min;
            preMinIndex = minIndex;
        }

        return result;
    }

    public void solution(int n, int[] one, int[] two, int[] three, int[] total) {
        int[] oneResult = new int[n];
        int[] twoResult = new int[n];
        int[] threeResult = new int[n];
        int[] totalResult = new int[n];

        oneResult = getGrade(n, one);
        twoResult = getGrade(n, two);
        threeResult = getGrade(n, three);
        totalResult = getGrade(n, total);

        for(int num : oneResult) System.out.print(num + " ");
        System.out.println();
        for(int num : twoResult) System.out.print(num + " ");
        System.out.println();
        for(int num : threeResult) System.out.print(num + " ");
        System.out.println();
        for(int num : totalResult) System.out.print(num + " ");
        System.out.println();
    }

    public static void main(String args[])
    {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] one = new int[n];
        int[] two = new int[n];
        int[] three = new int[n];
        int[] total = new int[n];

        for(int i=0; i<n; i++) one[i] = sc.nextInt();
        for(int i=0; i<n; i++) two[i] = sc.nextInt();
        for(int i=0; i<n; i++) three[i] = sc.nextInt();
        for(int i=0; i<n; i++) total[i] = one[i] + two[i] + three[i];
        T.solution(n, one, two, three, total);
    }
}