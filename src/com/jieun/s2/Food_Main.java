package com.jieun.s2;

import java.util.Scanner;

public class Food_Main {

	public static void main(String[] args) {

		Chef_Steak c= new Chef_Steak();
		Chef_Pasta p = new Chef_Pasta();
		/*Scanner sc = new Scanner(System.in);
		System.out.println("번호입력");
		int select = sc.nextInt();
		Food_Steak steak = c.makeSteak(select);

		Food_Pasta pasta=p.makePasta(select);
		if(steak != null) {
			System.out.println("메뉴:"+steak.name+" "+pasta.name);
			System.out.println("가격:"+steak.price+" "+pasta.price);
			System.out.println("소스:"+steak.source.oilname+" "+pasta.source.oilname);
			System.out.println("향신료:"+steak.source.spiceName+" "+pasta.source.spiceName);
		}*/
		Menu m = new Menu();
		m.order();
		
	}

}

