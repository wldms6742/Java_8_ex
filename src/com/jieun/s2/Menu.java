package com.jieun.s2;

import java.util.Scanner;

public class Menu {

	public void order() {
		Scanner sc = new Scanner(System.in);
		Chef_Pasta p = new Chef_Pasta();
		Chef_Steak s = new Chef_Steak();
		Bill b = new Bill();
		System.out.println("1.안심스테이크");
		System.out.println("2.등심스테이크");
		System.out.println("3.립  스테이크");
		System.out.println("4.크림파스타");
		System.out.println("5.로제파스타");
		System.out.println("6.알리오올리오");
		int select  = sc.nextInt();

		if(select<=3) {
			Food_Steak steak = s.makeSteak(select);
			b.billSteak(steak);

		}else if(select>3){
			Food_Pasta pasta = p.makePasta(select-3);
			b.billPasta(pasta);

		}
	}
}

