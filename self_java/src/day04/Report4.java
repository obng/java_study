package day04;

public class Report4 {

	public static void main(String[] args) {
		// 문제4번. 학생 별 평균 계산하기
		int[][] student = new int[3][5];
		int sum;
		
		
		// 점수 출력
		for (int i=0; i<student.length; i++) {
			for (int j=0; j<student[i].length; j++) {
				int score = (int)(Math.random()*51) + 50;
				
				student[i][j] += score;
				System.out.printf("%d\t", student[i][j]);
			}
			System.out.println();
			
		}
		
		// 평균 구하기
		for (int i=0; i<student.length; i++) {
			sum = 0;
			for (int j=0; j<student[i].length; j++) {
				sum += student[i][j];
			}
			System.out.printf("%d번 학생 평균 = %.2f\n", i+1 , sum/5.0);
		}
		
		
	}

}
