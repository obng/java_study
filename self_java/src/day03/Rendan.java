package day03;

public class Rendan {

	public static void main(String[] args) {
		// p183 문제3번
		// 추가: 몇 번만에 탈출했는지 출력
		
		int count = 0;
		
		int num1 = (int) ((Math.random() * 6) + 1);
		int num2 = (int) ((Math.random() * 6) + 1);
		
		while (true) {
			System.out.printf("(%d, %d)\n", num1, num2);
			count++;
			if (num1+num2 == 5) {
				System.out.println("횟수: " + count);
				break;
			}
			else {
				
				num1 = (int) ((Math.random() * 6) + 1);
				num2 = (int) ((Math.random() * 6) + 1);
			}
			
		}
		
		// 문제4번
		for (int x=1; x<=10; x++) {
			for (int y=1; y<=10; y++) {
				int sum = 4*x + 5*y;

				if (sum == 60) System.out.printf("(%d, %d)\n", x, y);
			}
		}
		
		// 문제6번
		for(int i=1; i<=4; i++) {
			for(int j=4; j>=1; j--) {
				if (i<j) System.out.print(" ");
				else System.out.print("*");
			}
			System.out.println();
		}

	
	}

}
