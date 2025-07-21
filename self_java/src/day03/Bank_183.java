package day03;

import java.util.Scanner;

public class Bank_183 {

	public static void main(String[] args) {
		// p183 문제7번
		boolean run = true;
		int balance = 0;
		int money;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");			
			System.out.println("-----------------------------");
			System.out.print("선택> ");
			int choose = Integer.parseInt(scanner.nextLine());
			
			switch (choose) {
			case 1:
				System.out.print("예금액> ");
				money = Integer.parseInt(scanner.nextLine());
				balance += money;
				 break;
			case 2:
				// 출금액이 부족할 경우 잔액 부족 출력
				// 출금 가능 금액 출력
				System.out.print("출금액> ");
				money = Integer.parseInt(scanner.nextLine());
				if (money > balance) {
					System.out.println("잔액이 부족합니다");
					System.out.printf("출금 가능 금액: %d\n", balance);
					System.out.println("다시 메뉴를 선택해주세요");
					break;
				}
				else {
					balance -= money;
					break;
					
				}
			case 3:
				System.out.printf("잔고> %d\n", balance);
				break;
			default:
				run = false;
				
			}
		}
		
		System.out.println("프로그램 종료");
		scanner.close();

	}

}
