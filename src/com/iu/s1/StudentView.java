package com.iu.s1;

public class StudentView {
	//학생들의 정보를 출력
	//메소드명은 view
	//학생들의 정보 출력 
	public void view(Student[] st) {

		for(int i=0;i<st.length;i++) {
		System.out.println("이름:"+st[i].name);
		System.out.println("번호:"+st[i].num);

		System.out.println("국어:"+st[i].kor);

		System.out.println("영어:"+st[i].eng);

		System.out.println("수학:"+st[i].math);

		System.out.println("총점:"+st[i].total);
		System.out.println("평균:"+st[i].avg);
		
	}
}
}
