package day04;

public class Report3 {

	public static void main(String[] args) {
		// 문제3. 현재 관객의 수 출력
		int count = 0;
		int[][] people = new int[3][10];
		
		for (int i=0; i<people.length; i++) {
			
			for (int j=0; j<people[i].length; j++) {
				int num = (int)(Math.random()*2);
				people[i][j] += num;
				
				if (num == 1) count++;
				System.out.printf(" %d ", people[i][j]);
			}
			System.out.println();
		}
		
		System.out.printf("관객의 수: %d", count);
	}

}
