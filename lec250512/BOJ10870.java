package hash;

import java.util.Scanner;

public class BOJ10870 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        
        long result = 0;
        int num = scan.nextInt();
        long beforeNum = 1;
        long temp;
        for(int i = 1; i <= num; i++){
        	temp = beforeNum;
        	beforeNum = result;
        	result = temp + result;
        }
        
        System.out.println(result);

	}

}