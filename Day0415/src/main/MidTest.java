package main;
import sub.Exam;
import java.util.Scanner;

public class MidTest{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Exam exam = new Exam();
		
		exam.printinfo();
		
		int input;
		do {
			input = scanner.nextInt();
			
			if (input ==1)
				exam.ex1();
			else if(input ==2)
				exam.ex2();
			
		}while (input != 0);
		
		
		scanner.close();
		
	}
}

//MidTest 클래스 내 main 함수
//Exam 클래스 생성
//Exam 클래스 기본 정보 호출
//do ~ while을 통해 0이면 프로그램 종료
//1이면 Exam/ex1 메소드 호출