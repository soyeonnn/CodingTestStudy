import java.io.*;

public class Main_10808 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int[] cnt = new int[26];
        for(char c : S.toCharArray()) {
            cnt[c-97]++;
        }

        for(int c : cnt) System.out.print(c + " ");
        System.out.println();
    }
}
