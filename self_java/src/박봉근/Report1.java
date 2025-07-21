package 박봉근;

import java.util.Scanner;

public class Report1 {

	public static void main(String[] args) {
		// 1.윤년 계산 프로그램
		Scanner sc = new Scanner(System.in);
		System.out.print("##년도 입력 : ");
		int year = Integer.parseInt(sc.nextLine());
		
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.printf("%d년은 윤년입니다.\n", year);
		}
		else {
			System.out.printf("%d년은 평년입니다.\n", year);
		}
		
		sc.close();
	}

}
