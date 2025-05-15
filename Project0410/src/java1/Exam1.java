package java1;

import java2.Exam2;
class Exam3{
	public int a;
	protected int b;
	int c;
	int d; // private int d;
}
public class Exam1 {

	public static void main(String[] args) {
		
		Exam2 ex2 = new Exam2();
		ex2.a = 3;
		System.out.println("Exam2 a : " + ex2.a);
		ex2.getA();
		
		Exam3 ex3 = new Exam3();
		ex3.a = 1;
		ex3.b = 2;
		ex3.c = 3;
		ex3.d = 4;
		System.out.println("Exam a. b. c. d: " + ex3.a + ", " + ex3.c + ", " + ex3.d);
	}

}
