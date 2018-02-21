package com.jieun.s3;

public class Car {
	String color;
	String brand;
	int cc;
	public Car() {
		//default, 생성자의 기본값 설정
		this("RED");//자신의 또다른 생성자를 호출
		}//기본값
	public Car(String color) {
		/*this.color = color;//해당 객체의 멤버변수 this사용(객체안에서만 사용가능),생략도 가능
		brand="Audi";
		cc=3000;*/
		this(color,"Audi"); //밑의 생성자를 호출함
	}//색깔을 바꾸고 싶을때 호출
	public Car(String color, String brand) {
		/*this.color=color;
		this.brand=brand;
		cc=3000;*/
		this(color,brand,3000);//생성자 라인의 첫줄에 항상 있어야한다. 
	}
	public Car(String c, String s, int i) {//매개변수가 있는 생성자 ->default생성자가 아님
		color=c;
		brand=s;
		cc=i;
	
	}
	public void info() {
		System.out.println("Color:"+color);
		System.out.println("Brand:"+brand);
		System.out.println("CC:"+cc);
		this.make();
	}
	public void make() {
		System.out.println("자동차 제작 완료");
		
	}
}
