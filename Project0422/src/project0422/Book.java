package project0422;

import java.util.Scanner;

class Book {
	String tite;
	String author;
}

public Book(String title, String author) {
	this.title = title;
	this.author = author;
}

public void printInfo() {
	System.out.println("제목: " + title + ", 작자: " + author);
}
}

public class BookTest{
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		Book[] books = new Book[3];
		
		for (int i = 0; i<books.length;i++) {
			System.out.print((i+1) + "번쨰 책 제목: ");
			String title = scanner.nextLine();
			System.out.print((i+1) + "번째 책 작자 : ");
			String author= scanner.nextLine();
			
			books[i] = new Book(title, author);
		}
		
		System.out.println("\n 입력한 책 정보: ");
		for(Book book : books) {
			book.printInfo();
		}
		scanner.close();
	}
}
			
		}
	}
}