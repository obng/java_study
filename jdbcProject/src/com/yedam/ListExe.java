package com.yedam;

import java.util.ArrayList;

public class ListExe {

	public static void main(String[] args) {
		// ArrayList
		int[] intAry = {10, 20, 30};
		
		for (int i=0; i<intAry.length; i++) {
			System.out.println("[" + i + "]번째 값: " + intAry[i]);
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10); // add: 추가
		list.add(20);
		list.add(30);
		
		ArrayList<Student> stdList = new ArrayList<Student>();
		Student s1 = new Student(); // 인스턴스
		s1.setStdNum(1000);
		s1.setStdName("박봉근");
		s1.setPhone("010-1234-5678");
		s1.setBloodType("A");
		
		Student s2 = new Student(2000, "홍길동", "010-9874-5612", "O");
		
		stdList.add(s1);
		stdList.add(s2);
		stdList.add(new Student(3000, "길잡이", "010-5468-1597", "B"));
		
		for (int i=0; i<stdList.size(); i++) {
			System.out.println("학번: " + stdList.get(i).getStdNum() +
					 "이름: ");
		}
		
		for (int i=0; i<list.size(); i++) {
			System.out.println("[" + i + "]번째 값: " + list.get(i));
		}
		
		System.out.println("end of progream");
	}

}
