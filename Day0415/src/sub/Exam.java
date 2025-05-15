package sub;

public class Exam {
	
	String name;
	String id;
	String major;
	
	public Exam() {
		this.name = "김규리";
		this.id = "2024112753";
		this.major = "컴퓨터공학전공";
	}
	public void printinfo() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(major);
	}
	
	public void ex1() {
		System.out.println("1번문제");
	}
	public void ex2() {
		System.out.println("2번문제");
		
	}
}
