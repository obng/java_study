package chap01;

import java.util.Scanner;

public class Ex_p120 {

	public static void main(String[] args) {
		// p120-1번
		System.out.println("----- 1번 -----");
		String name = "감자바";
		int age = 25;
		String tel1 = "010", tel2 = "1234", tel3 = "5678";
		
		System.out.println("이름: "+ name);
		System.out.print("이름: " + age + "\n");
		System.out.printf("전화: %s-%s-%s \n\n", tel1, tel2, tel3);
		
		// p120-2번
		System.out.println("----- 2번 -----");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 수: ");
		int num1 = Integer.parseInt(sc.nextLine());
		
		System.out.print("두 번째 수: ");
		int num2 = Integer.parseInt(sc.nextLine());
		
		int result = num1 + num2;
		System.out.println("덧셈 결과: " + result);
		
		sc.close();
	}

}
