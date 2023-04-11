import java.io.*;
public class Main_10988 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        String reverseWord = new StringBuilder(word).reverse().toString();
        if(word.equals(reverseWord)) System.out.println(1);
        else System.out.println(0);
    }
}
