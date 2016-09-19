package examples;

import java.util.Scanner;

public class CalcularMedia {

	public static void main(String[] args) {

		int x,y;
		double z;
		
		// https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html
		Scanner sc = new Scanner(System.in);
		
		System.out.println("x:");
		x = sc.nextInt();
		x=6;
		y=5;
		z = (double)(x+y)/2;
		
		System.out.println("z:" + z);
		System.out.format("z:%.2f", z);  // two decimals
		
		sc.close();
	}

}
