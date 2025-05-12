package hash;

import java.util.Scanner;

public class BOJ15829 {
	public static void main(String[] args) {
		
		final int r = 31;
		final int M = 1234567891;
		
		Scanner scan = new Scanner(System.in);
		int L = Integer.parseInt(scan.nextLine());
		String a = scan.nextLine();
		
		long hash = 0;
		long power = 1;
		
		for(int i = 0; i < L; i++) {
			hash += ((a.charAt(i) - 'a' + 1) * power) % M;
            hash %= M;
			power = (power * r) % M;
		}
		
		System.out.println(hash);
	}
}

