package day05;

public class Student {
	// 객체 생성 클래스
	// 필드: 객체의 속성(데이터)
	String name;
	int kor;
	int eng;
	int math;
	
	
	// 생성자: 객체 생성시 속성 값을 초기화
	Student(String name, int kor, int eng, int math) {
		
		// 생성자에서 만들어졌다는 것을 알려주기 위해 this를 사용함
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}
	
	// 메소드: 객체의 기능
	
	// 총점
	int total() {
		int sum = this.kor + this.eng + this.math;
		return sum;
	}
	
	// 평균
	double avg() {
		return this.total() / 3.0;
	}
	
	// 등급
	char grade() {
		char gradeChar;
		switch((int)this.avg() / 10) {
			case 10:
			case 9: gradeChar = 'A'; break;
			case 8: gradeChar = 'B'; break;
			case 7: gradeChar = 'C'; break;
			case 6: gradeChar = 'D'; break;
			default: gradeChar = 'F';
		}
		return gradeChar;
	}
	
	
}
