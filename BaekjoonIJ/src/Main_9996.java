import java.io.*;
public class Main_9996 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String pattern = br.readLine();
        String[] fileNames = new String[N];
        for(int i=0; i<N; i++) {
            String fileName = br.readLine();
            fileNames[i] = fileName;
        }
        String[] patternSplit = pattern.split("\\*");
        for(String fileName : fileNames) {
            if(fileName.length() < pattern.length()-1) {
                System.out.println("NE");
            }
            else if(fileName.substring(0, patternSplit[0].length()).equals(patternSplit[0]) && fileName.substring(fileName.length()-patternSplit[1].length()).equals(patternSplit[1])) {
                System.out.println("DA");
            } else System.out.println("NE");
        }
    }
}
