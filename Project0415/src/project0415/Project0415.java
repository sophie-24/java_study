package project0415;

public class Project0415 {
	int b;
	static int c;
	
	void f1() {
		b = 500; // 전역변수
	}
	
	void f2() {
		int a;
		a = 200; // 지역변수
		c = 300;
		
		//static은 지역변수를 전역변수처럼 사용 가능하도록 해 줌.
	}
	public static void main(Strig[]args) {
		
		int a;
		a = 100;
		project.f1();
		project.f2();
		
		p(a), p(b), p(c)
		}
	}

}
