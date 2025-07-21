package chap04;

public class Gugudan {

	public static void main(String[] args) {
		// 구구단
		// 단 반복
		
		for(int dan = 2; dan < 10; dan++) {
			System.out.println("----- " + dan + "단 -----");
			
			for(int gob = 1; gob < 10; gob++) {
				System.out.printf("%d x %d = %d\n", dan, gob, dan*gob);
			}
			System.out.println();
		}
		
		// 구구단 2
		for (int t=2; t<10; t++) {
			System.out.printf("%3d단", t);
			System.out.printf("    ");
		}
		
		System.out.println();
		for (int i=1; i<10; i++) {
			for (int l=2; l<10; l++) {
				System.out.printf("%dx%d= %2d ", l, i, l*i);
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 별찍기
		for (int i=1; i<=4; i++) {
			for(int l=1; l<=i; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		// p182 문제3
		// 1에서 100까지 정수 중 3의 배수 합, 3의 배수의 갯수
		int sum = 0;
		int count = 0;
		for (int i=1; i<=100; i++) {
			if (i%3 == 0 ) {
				sum += i;
				count++;
			}
		}
		System.out.printf("3의 배수의 합: %d\n", sum);
		System.out.printf("3의 배수의 개수: %d", count);
	}

}
