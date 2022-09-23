package iteration;

import java.io.*;

public class S11022 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=n; i++) {
			String input = br.readLine();
			int a = Integer.parseInt(input.split(" ")[0]);
			int b = Integer.parseInt(input.split(" ")[1]);
			
			System.out.println("Case #" + i + ": " + a + " + " + b + " = " + (a+b));
		}
	}
}
