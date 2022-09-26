package iteration;

import java.io .*;

public class S1110 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int c = n;
		int answer = 0;
		
		while(true) {
			c = ((c % 10) * 10) + (((c / 10) + (c % 10)) % 10);
			answer++;
			if(n == c) break;
		}
		
		bw.write(answer + "");
		bw.flush();
	}
}
