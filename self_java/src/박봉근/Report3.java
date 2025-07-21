package 박봉근;

import java.util.Scanner;

public class Report3 {

	public static void main(String[] args) {
		// 3.숫자 추측 게임
		Scanner sc = new Scanner(System.in);
		
		int comNum = (int) (Math.random() * 100) + 1;
		
		while (true) {
			System.out.print("숫자 입력 : ");
			int num = Integer.parseInt(sc.nextLine());
			
			if (num > comNum) System.out.println("down하세요!!");
			else if (num < comNum) System.out.println("up하세요!!");
			else {
				System.out.println("축하합니다!!");
				break;
			}
		}
		
		sc.close();
	}

}
