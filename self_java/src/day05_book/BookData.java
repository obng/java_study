package day05_book;

import java.util.Scanner;

public class BookData {
	
	Scanner scanner = new Scanner(System.in);
	
	Book[] bookData(int n) {
		Book[] books = new Book[n];
		
		for (int i=0; i<n; i++) {
			System.out.printf("%d 번째 도서 정보 입력", i+1);
			
			System.out.print("도서번호 > ");
			int bookNum = Integer.parseInt(scanner.nextLine());
			
			System.out.print("도서제목 > ");
			String subject = scanner.nextLine();
			
			System.out.print("도서가격 > ");
			int price = Integer.parseInt(scanner.nextLine());
			
			books[i] = new Book(bookNum, subject, price);			
		}
		
		return books;
	}
}
