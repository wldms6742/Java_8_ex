package com.jieun.s3;

public class Point {
	//메서드 오버로딩(overloading)
	//메서드 오버로딩의 조건
	//1.메서드의 이름은 같아야한다
	//2. 매개변수의 타입, 또는 갯수가 달라야 함.
	//3.접근지정자와 리턴 타입은 상관 없음
	public void hap(int a,int b) {
		System.out.println(a+b);
	}
	public void hap(int a,float b) {
		System.out.println(a+b);
	}
	public void hap(float a, float b) {
		System.out.println(a+b);
	}
}
