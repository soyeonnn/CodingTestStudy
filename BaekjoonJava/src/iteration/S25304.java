package iteration;

import java.io.*;

public class S25304 {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int total = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			String[] input = br.readLine().split(" ");
			total -= Integer.parseInt(input[0]) * Integer.parseInt(input[1]);
		}
		if(total == 0) System.out.println("Yes");
		else System.out.println("No");
	}
}
