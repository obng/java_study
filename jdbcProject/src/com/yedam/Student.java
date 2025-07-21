package com.yedam;

// 속성: 필드
// 기능: 메소드

public class Student {
	private int stdNum;
	private String stdName;
	private String phone;
	private String bloodType;
	
	// 메소드 (getter, setter)
	// private를 사용하면 getter, setter 메소드를 통해 값을 사용함
	// 값을 지정할 때: setter -> set
	
	// 생성자
	public Student(int stdNum, String stdName, String phone, String bloodType) {
		this.stdNum = stdNum;
		this.stdName = stdName;
		this.phone = phone;
		this.bloodType = bloodType;
	}
	
	
	// stdNum에 대한 set, get
	public void setStdNum(int stdNum) {
		this.stdNum = stdNum;	
	}
	
	public int getStdNum() {
		return stdNum;
	}
	
	// stdName에 대한 set, get
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	
	public String getStdName() {
		return stdName;
	}
	
	// phone에 대한 set, get
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getPhone() {
		return phone;
	}
	
	// bloodType에 대한 set, get
	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}
	
	public String getBloodType() {
		return bloodType;
	}
}
