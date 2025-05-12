package divideconquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ4779 {
	static String resultStr;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strNum;
		
		while((strNum = br.readLine()) != null) {
			int num = Integer.parseInt(strNum);
			
			char[] line = new char[(int)Math.pow(3, num)];
			Arrays.fill(line, '-');
			
			cantor(line, 0, line.length);
			
			System.out.println(line);
		}
	}
	
	public static void cantor(char[] line, int start, int size) {
		// base condition
		if(size == 1) return;
		
		// 분할
		int newSize = size / 3;
		
		//mid -> 공백으로 만들기
		Arrays.fill(line, start + newSize, start + 2 * newSize, ' ');
		
		//left
		cantor(line, start, newSize);
		
		//right
		cantor(line, start + 2 * newSize, newSize	);
		
	}
}
