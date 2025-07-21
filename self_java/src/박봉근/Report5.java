package 박봉근;

import java.util.Scanner;

public class Report5 {

	public static void main(String[] args) {
		// 5.섭씨-화씨 온도 변환 프로그램
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		double temC = 0;
		double temF = 0;
		
		while (run) {
			System.out.println("----------------------");
			System.out.println("1. 화씨 => 섭씨");
			System.out.println("2. 섭씨 => 화씨");
			System.out.println("3. 종료");			
			System.out.println("----------------------");
			
			System.out.print("▶ 번호 선택 : ");
			int choose = Integer.parseInt(sc.nextLine());
			
			switch (choose) {
			case 1:
				System.out.print("▶ 화씨 온도 입력 : ");
				temF = Double.parseDouble(sc.nextLine());
				
				temC = 5.0 / 9 * (temF - 32);
				System.out.printf("  섭씨온도 = %f\n", temC);
				break;
			case 2:
				System.out.print("▶ 섭씨 온도 입력 : ");
				temC = Double.parseDouble(sc.nextLine());
				
				temF = 9.0 / 5 * temC + 32;
				System.out.printf("  화씨온도 = %f\n", temF);
				break;
			default:
				run = false;
			}
		}
		
		System.out.println("program end");
		sc.close();

	}

}
