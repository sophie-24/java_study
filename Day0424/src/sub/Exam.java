package sub;
import java.util.Scanner;
public class Exam {
	public String major;
	public String name;
	public String studentid;
	
	Scanner scanner = new Scanner(System.in);
	
	public Exam() {
		this.major = "컴퓨터공학전공";
		this.name = "김규리";
		this.studentid = "2024112753";
	}
	
	public void printInfo() {
		System.out.println(major);
		System.out.println(name);
		System.out.println(studentid);
	}
	
	//ex1
	public void ex1() {
		System.out.print("반지름 입력: ");
		double radius = scanner.nextDouble();
		final double PI = 3.1415;
	    System.out.println("원의 면적: " + (radius*radius*PI));
	}
	
	public void ex2() {
		System.out.print("이름, 도시, 나이, 독신여부 입력: ");
		String name = scanner.next();
		String city = scanner.next();
		int age = scanner.nextInt();
		Boolean single = scanner.nextBoolean();
		System.out.print(name + " " + city + " "+age + " "+single);
	}
	public void ex3() {
		System.out.print("점수 입력: ");
		int score = scanner.nextInt();
		if (score>=90)
			System.out.print("A");
		else if (score>=80)
			System.out.print("B");
		else if (score>=70)
			System.out.print("C");
		else 
			System.out.print("D");
		
	}
	public void ex4() {
		System.out.print("정수 입력: ");
		int num = scanner.nextInt();
		if (num%3==0)
			System.out.print("3배수");
		else
			System.out.print("3배수 아님");
	}
	public void ex8() {
		int array[] = new int [5];
		System.out.print("배열 수 5개 입력: ");
		int max = 0;
		for (int i = 0;i<array.length;i++) {
			array[i] = scanner.nextInt();
			if(array[i] >=max)
				max = array[i];
		}
		System.out.print("가장 큰 수 " + max);
	}
	public void ex9() {
		System.out.print("정수 2개 입력: ");
		double num1 = scanner.nextInt();
		double num2 = scanner.nextInt();
		try {
			System.out.println(num1/num2);
		}
		catch(ArithmeticException e) {
			System.out.println("오류");
		}
	}
	//10번
	public class Rectangle {
		int width;
		int height;
		
		public int getArea() {
			return width*height;
		}
	}
		
	public void ex10() {
		Rectangle rect = new Rectangle();
		
		System.out.print("w와 h 입력: ");
		rect.width = scanner.nextInt();
		rect.height = scanner.nextInt();
		
		System.out.println(rect.getArea());
	}
	
	//11번
	public class circle{
		int radius;
		String name;
		
		public circle() {
			radius = 1;
			name = "";
		}
		public circle(int r, String n) {
			radius = r;
			name = n;
		}
		public double getArea() {
			return (3.14*radius*radius);
		}
	}
	
	public void ex11() {
		int ra = scanner.nextInt();
		String na = scanner.next();
		circle main = new circle(ra, na);
		System.out.println("이름은" + main.name);
		System.out.println("면적은 " + main.getArea());
	}
	
	//12번
	public class Book{
		String title;
		String author;
		public Book(String t, String a) {
			this.title = t;
			this.author = a;
		}
	}
	public void ex12() {
		Book[] books = new Book[3];
		
		for (int i = 0;i<books.length;i++) {
			System.out.print((i+1)+"번째 입력");
			String title = scanner.next();
			String author = scanner.next();
			books[i] = new Book(title, author);
		}
		System.out.println("\n입력한 책 정보");
		for (int i = 0;i<books.length;i++) {
			System.out.println((i+1)+books[i].title+books[i].author);
		}
	}
}
