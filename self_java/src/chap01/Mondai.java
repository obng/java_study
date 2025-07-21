package chap01;

import java.util.Scanner;

public class Mondai {

	public static void main(String[] args) {
		// 問題　1。
		// 수 20이 4의 배수이면서 5의 배수인지 체크(if)
		// 결과 = 20은 4와 5의 배수 입닌다. 출력(printf)
		// 아니면 20은 4와 5의 배수가 아닙니다. 출력(printf)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수를 입력하세요: ");
		int num = Integer.parseInt(sc.nextLine());
		
//		if ((num % 4 == 0) && (num % 5 == 0)) {
//			System.out.printf("%d은 4와 5의 배수 입니다.", num);
//		}
//		else  {
//			System.out.printf("%d은 4와 5의 배수가 아닙니다.", num);
//		}
		

		String result2 = (num % 4 == 0) && (num % 5 == 0) ?  "배수입니다" : "배수가 아닙니다.";
		System.out.printf("%d은 4와 5의 %s", num, result2);
		
	}

}
