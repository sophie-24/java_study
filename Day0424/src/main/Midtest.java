
package main;

import java.util.Scanner;
import sub.Exam;

public class Midtest {
	public static void main(String[]args) {
		Exam exam = new Exam(); 
		
		Scanner scanner = new Scanner(System.in);
		
		exam.printInfo();
		int input;
		
		do {
			System.out.print("\n번호 입력 >>");
			input = scanner.nextInt();
			
			if(input == 1)
				exam.ex1();
			else if(input ==2)
				exam.ex2();
			else if (input ==3)
				exam.ex3();
			else if (input ==4)
				exam.ex4();
			else if (input ==9)
				exam.ex9();
			else if (input ==10)
				exam.ex10();
			else if (input ==11)
				exam.ex11();
			else if (input ==12)
				exam.ex12();			
			
		}while (input !=0);
		
		System.out.println("종료");
		scanner.close();
	}

}
