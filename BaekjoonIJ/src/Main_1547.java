import java.util.*;
import java.io.*;
public class Main_1547 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int M = Integer.parseInt(br.readLine());
        int[] cup = new int[4];
        for(int i=1; i<=3; i++) cup[i] = i;

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int cup1 = Integer.parseInt(st.nextToken());
            int cup2 = Integer.parseInt(st.nextToken());
            int n1 = 0, n2 = 0;
            for(int j=1; j<=3; j++) {
                if(cup[j] == cup1) n1 = j;
                if(cup[j] == cup2) n2 = j;
            }
            int tmp = cup[n1];
            cup[n1] = cup[n2];
            cup[n2] = tmp;
        }
        System.out.println(cup[1]);
    }
}
