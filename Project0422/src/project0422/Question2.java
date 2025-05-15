package project0422;
import java.util.Scanner;
public class Question2 {
	public static void main(String []args) {
	Scanner scanner = new Scanner(System.in);
	
	String name = scanner.next();
	String city = scanner.next();
	int age = scanner.nextInt();
	boolean single = scanner.nextBoolean();
	

	System.out.println(name + " " + city + " " + age + " " + single);
	scanner.close();

}
}