package 박봉근;

import java.util.Scanner;

public class Report2 {

	public static void main(String[] args) {
		// 2.동전 교환 프로그램
		Scanner sc = new Scanner(System.in);
		System.out.print("##교환할 금액 : ");
		int money = Integer.parseInt(sc.nextLine());
		int coin;
		int last;
		
		coin = money / 500;
		System.out.printf("500원 짜리 : %d개\n", coin);
		last = money % 500;
		
		coin = last / 100;
		System.out.printf("500원 짜리 : %d개\n", coin);
		last = last % 100;
		
		coin = last / 50;
		System.out.printf("50원  짜리 : %d개\n", coin);
		last = last % 50;
		
		coin = last / 10;
		System.out.printf("50원  짜리 : %d개\n", coin);
		last = last % 10;
		
		System.out.printf("교환   금액 : %d원\n", money-last);
		System.out.printf("남은   금액 : %d원\n", last);
		
		sc.close();

	}

}
