import java.util.*;
import java.io.*;
public class Main_4659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        ArrayList<String> inputs = new ArrayList<>();
        while(!input.equals("end")) {
            inputs.add(input);
            input = br.readLine();
        }

        for(String word : inputs) {
            boolean isVowelUsed = false;
            StringBuilder sb = new StringBuilder();
            int continueConsonantCnt = 0;
            int continueVowelCnt = 0;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                    isVowelUsed = true;
                    continueVowelCnt++;
                    if(continueVowelCnt == 3) break;
                    continueConsonantCnt = 0;
                } else {
                    continueConsonantCnt++;
                    if(continueConsonantCnt == 3) break;
                    continueVowelCnt = 0;
                }
                sb.append(word.charAt(i));
                if(i>0 && word.charAt(i-1) == word.charAt(i)) {
                    if((word.charAt(i-1) != 'e' || word.charAt(i) != 'e') && (word.charAt(i-1) != 'o' || word.charAt(i) != 'o')) {
                        isVowelUsed = false;
                        break;
                    }
                }
            }
            if (isVowelUsed && sb.length() == word.length()) System.out.println("<" + word + "> is acceptable.");
            else System.out.println("<" + word + "> is not acceptable.");
        }
    }
}
