package com.iu.s1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

/*		SchoolController school_c= new SchoolController();
		school_c.start();
*///한줄로 줄이기
		new SchoolController().start();//객체를 한번이상 사용하지 않을 떄 사용한다
	}

}
