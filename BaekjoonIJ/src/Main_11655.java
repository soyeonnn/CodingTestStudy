import java.io.*;
public class Main_11655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        for(char c : s.toCharArray()) {
            if(Character.isLowerCase(c)) System.out.print((char)((c-97+13) % 26 + 97));
            else if(Character.isUpperCase((c))) System.out.print((char)((c-65+13) % 26 + 65));
            else if(Character.isDigit(c)) System.out.print(c);
            else System.out.print(" ");
        }
    }
}
