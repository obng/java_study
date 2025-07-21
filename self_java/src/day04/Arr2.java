package day04;

public class Arr2 {

	public static void main(String[] args) {
		// 2차원 배열
		// 배열 선언
		int[][] twoArr = {
				{80, 90},
				{70, 60, 50}
		};
		
		// 2차원 배열 출력
		for (int i=0; i<twoArr.length; i++) {
			for (int j=0; j<twoArr[i].length; j++) {
				System.out.printf("| %d |", twoArr[i][j]);
			}
			System.out.println();
		}

	}

}
