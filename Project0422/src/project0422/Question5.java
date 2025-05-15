package project0422;

import java.util.Scanner;
public class Question5 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		String menu = scanner.next();
		switch(menu) {
		case "에스프레소":
		case "카푸치노":
		case "카페라떼":
			System.out.println("3500");
			break;
		case "아메리카노":
			System.out.println("2000");
			break;
		default:
			System.out.println("메뉴가 없습니다.");
			break;
	}
		scanner.close();
}
}