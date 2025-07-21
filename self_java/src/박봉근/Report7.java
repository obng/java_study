package 박봉근;

public class Report7 {

	public static void main(String[] args) {
		// 7.3, 6, 9 게임 프로그램
		int count = 0;
		
		for (int i=1; i<=50; i++) {
			// 10개씩 줄바꿈
			if (i%10 == 0) {
				System.out.print("\n");
			}
			
			// 
			if (i%10 == 3 || i%10 == 6 || i%10 == 9) {
				count++;
			}
			else if (i/10 == 3) {
				count++;
			}
			
			// 출력
			if (count == 0) {
				System.out.printf("%d\t", i);
			}
			else if (count == 1) {
				System.out.print("🖤\t");
			}
			else if (count == 2) {
				System.out.print("🖤🖤\t");
			}
			
			
		}
		
		
//		for (int i=1; i<=50; i++) {
//
//			if (i/10 == 3 && (i%10 == 3 || i%10 == 6 || i%10 == 9)) {
//				System.out.print("🖤🖤\t");
//			}
//			else if (i/10 == 3) {
//				System.out.print("🖤\t");
//			}
//			else if (i%10 == 3 || i%10 == 6 || i%10 == 9) {
//				System.out.print("🖤\t");
//			}
//			else System.out.printf("%d\t", i);
//			
//			// 10개씩 줄바꿈
//			if (i%10 == 0) {
//				System.out.print("\n");
//			}
//			
//		}
		

	}

}
