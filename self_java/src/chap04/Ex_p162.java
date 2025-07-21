package chap04;

public class Ex_p162 {

	public static void main(String[] args) {
		// 주사위 게임
		// 주사위를 2개 던져서 합이 10을 넘으면 두수를 더하고 > 덧셈 결과: 000
		// 아니면 두 수를 곱한 결과를 출력 -> 곱셈 결과: 000
		
		int num1 = (int) (Math.random() * 6) + 1;
		int num2 = (int) (Math.random() * 6) + 1;
		
		if (num1 + num2 > 10 ) {
			System.out.printf("%d와 %d의 덧셈 결과: %d\n", num1, num2, (num1 + num2));
		}
		else {
			System.out.printf("%d와 %d의 곱셈 결과: %d\n\n", num1, num2, (num1 * num2));
		}
		
		// 오전 시간 (9~12) 일정 출력
		// 현재 시간 확인
		// 9시: 출근합니다
		// 10시: 회의합니다.
		// 11시: 업무를 봅니다.
		// 12시: 외근을 나갑니다.
		
		int time = (int) (Math.random() * 4) + 9;
		System.out.println("현재시간: " + time + "시");
		
		switch(time) {
		case 9:
			System.out.println("출근합니다");
		case 10:
			System.out.println("회의합니다.");
		case 11:
			System.out.println("업무를 봅니다.");
		case 12:
			System.out.println("외근을 나갑니다.");
		}
		System.out.println("오늘 일정 끝\n ");
		
		// p169 문제3 -> switch문으로 변경
		int score = 85;
		String grade = "";
		System.out.print("등급은 ");
		
		switch (score/10) {
		case 10:
		case 9: grade = "A"; break;
		case 8: grade = "B"; break;
		case 7: grade = "C"; break;
		default: grade = "D"; break;
		}
		
		System.out.printf("%s 입니다.\n\n", grade);
		
		// 주사위 게임
		// 주사위 2개 던져서 합이 10이 되면 탈출
		// 주사위 순서쌍 출력	(5, 2)
		// 5회 이상이 되면 게임 오버 출력
		
		
		
		for (int i = 1; i <= 5; i++) {
			int rendanNum1 = (int) (Math.random() * 6) + 1;
			int rendanNum2 = (int) (Math.random() * 6) + 1;
			int hab = rendanNum1 + rendanNum2;
			
			System.out.printf("(%d, %d)", rendanNum1, rendanNum2);
			
			if (hab > 10) {
				System.out.println("게임 승");
				break;
			}
		}
		System.out.println("게임 오버...");
		

	}

}
