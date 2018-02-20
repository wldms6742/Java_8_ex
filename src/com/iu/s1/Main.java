package com.iu.s1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean check=true;
		while(check) {
			System.out.println("번호를 입력하세요");
			int num = sc.nextInt();
			SchoolController school_c= new SchoolController();
			school_c.start(num);
			}
	}

}
