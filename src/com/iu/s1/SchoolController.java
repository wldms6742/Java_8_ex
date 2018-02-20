package com.iu.s1;

import java.util.Scanner;

public class SchoolController {
	//메서드명은 start
	//리턴 x
	//내용은 
	//1.학생등록
	//2.성적입력
	//3.성적조회
	//4.전체조회
	//5.프로그램종료
	public void start(){
		Scanner sc = new Scanner(System.in);
		Student[] student = null;
		StudentService ss= new StudentService();
		StudentView sv = new StudentView();	
		boolean check = true;
		while(check) {
			System.out.println("1.학생   등록");
			System.out.println("2.성적   입력");
			System.out.println("3.성적   조회");
			System.out.println("4.전체   조회");
			System.out.println("5.프로그램종료");
			System.out.println("번호를 입력하세요");
			int n = sc.nextInt();
			switch(n) {
			case 1 :
				student = ss.addStudent();
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				sv.view(student);
				
				break;
			case 5:
				
				check =!check;
				break;
			}

		}
		}
}
