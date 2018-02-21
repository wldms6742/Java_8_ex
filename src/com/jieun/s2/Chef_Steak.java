package com.jieun.s2;

public class Chef_Steak {
	
	public Food_Steak makeSteak(int select) {
		//1. 안심스테이크, 30000, 1번소스
		//2. 등심스테이크 , 40000, 2번소스
		//3. 립스테이크, 50000, 1번소스
		Food_Steak steak = null;
		Chef_Source source = new Chef_Source();
		switch (select) {
		case 1:
			steak = new Food_Steak();
			steak.name = "안심스테이크";
			steak.price = 30000;
			steak.source = source.makeSource(1);
			break;
		case 2:
			steak = new Food_Steak();
			steak.name = "등심스테이크";
			steak.price = 40000;
			steak.source = source.makeSource(2);
			break;
		case 3:
			steak = new Food_Steak();
			steak.name = "립스테이크";
			steak.price = 50000;
			steak.source = source.makeSource(1);
			break;
		default:
			break;
		}
		return steak;
	}
}
