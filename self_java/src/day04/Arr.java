package day04;

public class Arr {

	public static void main(String[] args) {
		// int 형의 배열 선언, 크기: 5
		// 배열에 50~100 사이의 수 5개 입력
		// 배열의 합 계산
		
		int[] nums = new int[5];
//		int sum = 0;
		
		for (int i=0; i<nums.length; i++) {
			nums[i] = (int) ((Math.random()*51) + 50);
		
//			nums[i] += random_num;
//			sum += nums[i];
//			System.out.printf("nums[%d]: %d\n", i, nums[i]);
			
		}
//		System.out.println("배열의 합: " + sum);
		
		int result = add(nums);
		System.out.println("배열의 합: " + result);
	}
	
	private static int add(int[] is) {
		int sum = 0;
		for (int i=0; i<is.length; i++) {
			sum += is[i];
		}
		return sum;
	}
	

}
