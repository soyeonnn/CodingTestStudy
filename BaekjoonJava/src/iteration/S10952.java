package iteration;

import java.io.*;

public class S10952 {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String input = br.readLine();
			int a = Integer.parseInt(input.split(" ")[0]);
			int b = Integer.parseInt(input.split(" ")[1]);
			if(a == 0 && b == 0) return;
			System.out.println(a+b);
		}
	}
}
