package day05_book;

import java.util.Scanner;

public class BookMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BookData bookdata = new BookData();
		Book[] books = null;
		boolean run = true;
		int whatBookNumber = 0;
		
		
		
		while(run) {
			System.out.println("---------------------------------------------------------");
			System.out.println("1.도서수 입력 2.도서정보 등록 3. 도서정보 전체조회 4.도서정보 분석 5.종료");
			System.out.println("---------------------------------------------------------");
			
			System.out.print("선택 > ");
			int choose = Integer.parseInt(scanner.nextLine());
			
			switch(choose) {
				case 1:
					System.out.print("도서 수 > ");
					whatBookNumber = Integer.parseInt(scanner.nextLine());
					break;
					
				case 2:
					books = bookdata.bookData(whatBookNumber);
					break;
					
				case 3:
					System.out.println(books.length);
					
					for(int i=0; i<books.length; i++) {
						System.out.printf("도서번호 : %d\t 가격 : %d\n",
										books[i].getBookNum, 
										books[i].getPrice);
					}
					break;
					
				case 4:
					int max;
					int min;
					
					// 최고가, 최저가
					for (int i=0; i<books.length; i++) {
						
					}
					
					break;
					
				default:
					run = false;
			}
		}
		
		System.out.println("프로그램 종료");
		
	}
		
}
