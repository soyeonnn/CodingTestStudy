package iteration;

import java.io.*;

public class S10951 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			while(true) {
				String input = br.readLine();
				int a = Integer.parseInt(input.split(" ")[0]);
				int b = Integer.parseInt(input.split(" ")[1]);
				System.out.println(a+b);
			}
		} catch (Exception e) {
			return;
		}
	}
}
