package project0422;

import java.util.Scanner;
public class Question4 {
	public static void main(String[]args) {
	Scanner scanner = new Scanner(System.in);
	
	int num = scanner.nextInt();
	
	if (num%3 == 0)
		System.out.println("3배수");
	else
		System.out.println("3배수 아님");
	
	scanner.close();

}
}