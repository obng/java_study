package day04;

import java.util.Scanner;

public class Ex_p223 {

	public static void main(String[] args) {
		// p223 문제 6번
		// switch문 이용

		boolean run = true;
		int studentNum = 0;
		int [] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.학생수 | 2. 점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------------");
			System.out.print("선택>");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			switch (selectNo) {
			case 1:
				System.out.print("학생수>");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum];
				break;
			case 2:
				for (int i=0; i<scores.length; i++) {
					System.out.printf("scores[%d]>", i);
					scores[i] = Integer.parseInt(scanner.nextLine());
				}
				break;
				
			case 3:
				for (int i=0; i<scores.length; i++) {
					System.out.printf("scores[%d]> %d\n", i, scores[i]);
				}
				break;
				
			case 4:
				int sum = 0;
				int max = scores[0];
				
				for (int i=0; i<scores.length; i++) {
					if(max < scores[i]) max = scores[i];
					
					sum += scores[i];
				}
				
				System.out.printf("최고 점수: %d\n", max);
				System.out.printf("평균 점수: %f", sum/(double)scores.length);
				
				/*
				 // 향상된 for문 
				 
				 int sum1 = 0;
				 int max1 = 0;
				 for (int score : scores)	{
				 	sum1 += score;
				 	if (max1 < score) max1 = score;
				 }
				 double avg = (double) sum1 / scores.length;
				 System.out.println("최고 점수 : " + max1);
				 System.out.println("평균 점수 : " + avg);
				
				*/
				 break;	 
				 
			case 5:
				run = false;
				break;
			
			default:
				System.out.println("잘못 선택함");
			}
			
		}
		System.out.println("프로그램 종료");
	}

}
