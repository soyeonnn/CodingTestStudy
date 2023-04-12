import java.util.*;
import java.io.*;
public class Main_10709 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int[][] sky = new int[H][W];
        for(int i=0; i<H; i++) {
            String input = br.readLine();
            for(int j=0; j<W; j++) {
                if(input.charAt(j) == 'c') sky[i][j] = 1;
                else sky[i][j] = 0;
            }
        }

        int[][] answer = new int[H][W];
        for(int i=0; i<H; i++) {
            for(int j=0; j<W; j++) {
                if(sky[i][j] == 1) answer[i][j] = 0;
                else {
                    if(j > 0 && answer[i][j-1] > -1) answer[i][j] = answer[i][j-1] + 1;
                    else answer[i][j] = -1;
                }
            }
        }

        for(int i=0; i<H; i++) {
            for(int j=0; j<W; j++) {
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }
    }
}
