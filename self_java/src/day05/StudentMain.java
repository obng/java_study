package day05;

public class StudentMain {

	public static void main(String[] args) {
		// 3. 객체 생성 -> 배열에 저장
//		Student[] students = {
//				new Student("홍길동", 100, 100, 100),
//				new Student("홍진", 34, 42, 45),
//				new Student("마우스", 54, 56, 34),
//				new Student("제리", 90, 78, 88),
//				new Student("톰", 24, 56, 78),
//				new Student("키티", 24, 56, 78),
//				new Student("홍수", 24, 56, 78),
//				new Student("톰", 24, 56, 78),
//				new Student("톰", 24, 56, 78),
//				new Student("톰", 24, 56, 78),
//				new Student("톰", 24, 56, 78),
//				new Student("톰", 24, 56, 78),
//		};
		
		// 5. 데이터 불러오기
		// 	데이터가 너무 많아 다른 파일로 옮김
		// 객체 생성 -> 데이터를 받아옴
		// 
		StudentDao stdao = new StudentDao();
		
		// 6. studens 라는 배열의 이름에 stdao의 데이터를 불러옴
		Student[] students = stdao.stData(); 
		
		// 4. 객체 사용
		for (int i=0; i<students.length; i++) {
			System.out.printf("%s\t %d\t %d\t %d\t %d\t %.1f\t %s\n", 
					students[i].name, 
					students[i].kor, 
					students[i].eng, 
					students[i].math,
					students[i].total(), 
					students[i].avg(), 
					students[i].grade());
		}
		
		
		
		// 1. 객체 생성
		// 1-1데이터 타입 (Student) 변수 이름 (내가 만드는 것) = 객체 생성 (new) 클래스 (Student)
		Student st1 = new Student("홍길동", 100, 100, 100);
		
		// 1-2. 데이터 타입이 Student -> 받아온 Student의 정보를 담을 수 있는 그릇이 Student
		// 1-3. new Student -> new를 통해 객체를 만듬 -> Student라는 객체의 주소를 얻음
		
		Student st2 = new Student("홍진", 34, 42, 45);
		Student st3 = new Student("마우스", 54, 56, 34);
		Student st4 = new Student("제리", 90, 78, 88);
		Student st5 = new Student("톰", 24, 56, 78);
		
		// 2. 객체 사용
		System.out.println();
		System.out.println("--------------------- 배열 사용 전 ---------------------");
		System.out.printf("%s\t %d\t %d\t %d\t %d\t %.1f\t %s\n", 
							st1.name, st1.kor, st1.eng, st1.math,
							st1.total(), st1.avg(), st1.grade());
		
		System.out.printf("%s\t %d\t %d\t %d\t %d\t %.1f\t %s\n", 
				st2.name, st2.kor, st2.eng, st2.math,
				st2.total(), st2.avg(), st2.grade());
		
		System.out.printf("%s\t %d\t %d\t %d\t %d\t %.1f\t %s\n", 
				st3.name, st3.kor, st3.eng, st3.math,
				st3.total(), st3.avg(), st3.grade());
		System.out.println();
		
	}

}
