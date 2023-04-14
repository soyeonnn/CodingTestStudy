import java.math.BigInteger;
import java.util.*;
import java.io.*;
public class Main_2870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<BigInteger> arr = new ArrayList<>();
        for(int i=0; i<N; i++) {
            String input = br.readLine();
            String tmpNum = "";
            for(char c : input.toCharArray()) {
                if(Character.isDigit(c)) tmpNum += c;
                else {
                    if(tmpNum.length() > 0) {
                        BigInteger num = new BigInteger(tmpNum);
                        arr.add(num);
                        tmpNum = "";
                    }
                }
            }
            if(tmpNum.length() > 0) {
                BigInteger num = new BigInteger(tmpNum);
                arr.add(num);
            }
        }

        Collections.sort(arr);
        for(BigInteger num : arr) System.out.println(num);
    }
}
