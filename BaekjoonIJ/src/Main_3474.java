import java.util.*;
import java.io.*;
public class Main_3474 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] nums = new int[T];
        for(int i=0; i<T; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        for(int n=0; n<T; n++) {
            int N = nums[n];
            int f = 0;
            int t = 0;

            for(int i=2; i<=N; i*=2) {
                t += N/i;
            }
            for(int i=5; i<=N; i*=5) {
                f += N/i;
            }

            System.out.println(Math.min(f, t));
        }


    }
}
