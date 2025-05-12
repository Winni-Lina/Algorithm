package divideconquer;

import java.util.Scanner;

public class BOJ2630 {
	
	static int numWhite = 0;
	static int numBlue = 0;
	static int[][] paper;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		paper = new int[N][N];
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				paper[i][j] = scan.nextInt();
			}
		}
		
		paper(0, 0, N);
		
		System.out.println(numWhite);
		System.out.println(numBlue);
	}
	
	static void paper(int row, int col, int size) {
		// base condition
		if (size == 1) {
			if (paper[row][col] == 0) numWhite++;
			else numBlue++;
			return;
		}
		
		if (isOneColor(row, col, size)) {
			if(paper[row][col] == 0) numWhite++;
			else numBlue++;
			return;
		}
		
		// 분할
		int newSize = size / 2;
		paper(row, col, newSize);
		paper(row, col + newSize, newSize);
		paper(row + newSize, col, newSize);
		paper(row + newSize, col + newSize, newSize);
	}
	
	static boolean isOneColor (int row, int col, int size) {
		int color = paper[row][col];
		for (int i = row; i < row + size; i++) {
			for(int j = col; j < col + size; j++) {
				if(paper[i][j] != color) return false;
			}
		}
		return true;
	}
}
