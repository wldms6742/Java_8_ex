package com.jieun.s3;

public class Member {
	String name="ii";
	int age=25;
	
	public Member() {
		System.out.println("생성자 실 행");
		System.out.println("멤버변수의 초기화 담당");
		name="iu";
		age=26;
	}
	
	public void info() {
		System.out.println(name);
		System.out.println(age);
		
	}
}
