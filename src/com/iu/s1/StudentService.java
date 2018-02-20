package com.iu.s1;

import java.util.Scanner;

public class StudentService {
	//학생추가 메소드
	//메소드명 : addStudent
	//학생의 인원수를 입력하세요
	//이름입력, 번호입력 =>결과를 schoolController 로 
	public Student[] addStudent() {
		
		
		System.out.println("학생의 인원수 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Student [] st_array=new Student[num];

		for(int i=0;i<st_array.length;i++) {
			Student student= new Student();
			System.out.println("이름:");
			student.name =sc.next();
			System.out.println("번호:");
			student.num=sc.nextInt();	
			st_array[i]=student;
		}
		
		return st_array;
	
}
	//메서드 명 addPoint
	//내용 : 각 학생의 점수 입력
	public void addPoint(Student[] st) {
	
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<st.length;i++)
		{	System.out.println(st[i].name+"의 성적");	
			System.out.println("국어:");
			st[i].kor=sc.nextInt();
			System.out.println("수학:");
			st[i].math=sc.nextInt();
			System.out.println("영어:");
			st[i].eng=sc.nextInt();
			st[i].total=st[i].kor+st[i].eng+st[i].math;
			st[i].avg=st[i].total/3;

			
		}
	}
	}
