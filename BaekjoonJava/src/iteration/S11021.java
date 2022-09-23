package iteration;

import java.io.*;

public class S11021 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=n; i++) {
			String[] input = br.readLine().split(" ");
			System.out.println("Case #" + i + ": " + (int)(Integer.parseInt(input[0]) + Integer.parseInt(input[1])));
		}
		
	}
}
