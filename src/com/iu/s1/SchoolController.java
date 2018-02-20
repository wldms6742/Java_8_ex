package com.iu.s1;

public class SchoolController {
	//메서드명은 start
	//리턴 x
	//내용은 
	//1.학생등록
	//2.성적입력
	//3.성적조회
	//4.전체조회
	//5.프로그램종료
	public void start(int n){
		
			switch(n) {
			case 1 :
				System.out.println("1.학생   등록");
				break;
			case 2:
				System.out.println("2.성적   입력");
				break;
			case 3:
				System.out.println("3.성적   조회");
				break;
			case 4:
				System.out.println("4.전체   조회");
				break;
			case 5:
				System.out.println("5.프로그램종료");

				break;
			}

	}
}
