package com.jieun.s2;

public class Bill {
	//steak 영수증
	public void billSteak(Food_Steak steak) {
		System.out.println(steak.name);
		System.out.println(steak.price);
		System.out.println(steak.source.oilname);
		System.out.println(steak.source.spiceName);
	}
	public void billPasta(Food_Pasta pasta) {
		System.out.println(pasta.name);
		System.out.println(pasta.price);
		System.out.println(pasta.source.oilname);
		System.out.println(pasta.source.spiceName);
	}
	//pasta 영수
	
}
