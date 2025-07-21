package 박봉근;

import java.util.Scanner;

public class Report6 {

	public static void main(String[] args) {
		// 6.가위, 바위, 보 게임 프로그램
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		
		while (run) {
			int comNum = (int) (Math.random() * 3);
			System.out.print("## 가위(0) 바위(1) 보(2) : ");
			
			int myNum = Integer.parseInt(sc.nextLine());
			
			if (myNum>2) run = false;
			else if (myNum == comNum) {
				System.out.printf("사람 %d, 컴 %d 비겼음\n", myNum, comNum);
			}
			else if (myNum == (comNum+1)%3) {
				System.out.printf("사람 %d, 컴 %d 승리\n", myNum, comNum);
			}
			else {
				System.out.printf("사람 %d, 컴 %d 짐\n", myNum, comNum);
			}
			
		}
		System.out.println("game over");
		sc.close();

	}

}
