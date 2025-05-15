package project0422;

import java.util.Scanner;
public class Question1 {
	public static void main(String [] args) {
		final double PI = 3.1415;
		Scanner scanner = new Scanner(System.in);
		double rad = scanner.nextDouble();
		System.out.println("원의 면적 : " + rad*rad*PI);
		scanner.close();
	}
}
