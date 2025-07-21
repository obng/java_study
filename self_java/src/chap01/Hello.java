package chap01;

public class Hello {

	public static void main(String[] args) {
		// 출력문
		int z = 5;
		System.out.println("Hello World");
		
		// 변수 값 교환
		char x = 'A';
		int y = 50;
		int c = 'A';

		System.out.println(c);
		
		// 기본 타입
		char font = 'a';
		int int_char = font + 1;
		char font2 = (char)int_char;
		
		System.out.println(font);
		System.out.print(int_char);
		System.out.println(font2);
		
		// 문자열 저장 -> String 객체타입 변수 생성
		String str = "홍길동";
		System.out.println(str);
 
		
		// 연산: 정수 -> 기본 타입 int, 실수 -> 기본 타입 double
		int su1 = 1;
		int su2 = 3;
//		int result = su1 / su2;
		double result = su1 / su2; // int / int = int
		
		// 결과 = 0.3333...
		result = (double) su1 / su2;
		System.out.println(result);
		
		// 문자열 비교
		String str1  = "신용권";
		String str2 = "신용권";
		String str3 = new String("신용권");
		
		boolean resultStr  = str1 == str2; // 데이터 저장 메모리 주소 비교 -> 같은 객체인지 확인
		boolean resultObj  = str2 == str3; // 
		
		System.out.println(resultStr); // true -> 같은 객체
		System.out.println(resultObj); // false -> 다른 객체
		System.out.println(str1.equals(str3)); // 객체 데이터 비교
		
		// &=, |=, ^= 연산
		int r1 = 1 & 2;
		int r2 = 1 | 2;
		int r3 = 1 ^ 2;
		
		// 결과는 2진수로 나오고 console에 10진수로 출력됨
		System.out.println("and 연산: " + r1);
		System.out.println("or 연산: " + r2);
		System.out.println("xor 연산: " + r3);
	
		
	}

}
