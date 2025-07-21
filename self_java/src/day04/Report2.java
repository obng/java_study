package day04;

public class Report2 {

	public static void main(String[] args) {
		// 과제2.2차원 배열 출력
		int[][] twoArr = {
				{1, 2, 3},
				{1, 2},
				{1},
				{1, 2, 3}
		};
		
		for (int i=0; i<twoArr.length; i++) {
			for (int j=0; j<twoArr[i].length; j++) {
				System.out.printf("%d ", twoArr[i][j]);
			}
			System.out.println();
		}
		
	}

}
