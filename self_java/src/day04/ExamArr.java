package day04;

public class ExamArr {

	public static void main(String[] args) {
		// 1.배열에 저장 된 값들의 합, 최댓값, 최소값 구하기
		// 1) 배열 값: 1에서 100까지의 난수 10개 배열에 저장
		// 2) 배열 값 출력
		// 3) 배열 값의 합계
		
		int[] nums = new int[10];
		
		for (int i=0; i<nums.length; i++) {
			nums[i] = (int) (Math.random()*100) + 1;
			
			System.out.printf("num[%d] = %d\n", i, nums[i]);
		}
		
		int result = add(nums);
		System.out.printf("배열의 합: %d\n", result);
		
		int min = min(nums);
		System.out.printf("최소값: %d\n", min);
		
		int max = max(nums);
		System.out.printf("최댓값: %d\n", max);
		
		// 배열의 요소 중 4의 배수 출력
		// 4의 배수 갯수 출력
		
		int count = 0;
		
		for (int i=0; i<nums.length; i++) {
			if (nums[i]%4 == 0) {
				count++;
				System.out.printf("4의 배수: %d\n", nums[i]);
			}
			
		}
		System.out.printf("4의 갯수: %d\n", count);
		
	}

	private static int add(int[] nums) {
		// 합구하기
		int sum = 0;
		
		for (int i=0; i<nums.length; i++) {
			sum += nums[i];
		}
		
		return sum;
	}
	
	private static int min(int[] nums) {
		int min = nums[0];
		
		for (int i=0; i<nums.length; i++) {
			
			if (min > nums[i]) min = nums[i];
		}
		
		return min;
	}
	
	private static int max(int[] nums) {
		int max = nums[0];
		
		for (int i=0; i<nums.length; i++) {
			
			if (max < nums[i]) max = nums[i];
		}
		
		return max;
	}
	
	

}
