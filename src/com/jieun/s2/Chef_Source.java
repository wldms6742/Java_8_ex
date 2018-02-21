package com.jieun.s2;

public class Chef_Source {
	
	Food_Source source = null;//소스 한개 만들고 들어가는 소스의 종류만 다르다
	
	public Food_Source makeSource(int select) {
		switch (select) {
		case 1:
			source = new Food_Source();
			source.oilname = "olive";
			source.spiceName = "Hub";
			break;
		case 2:
			source = new Food_Source();
			source.oilname = "Milk";
			source.spiceName = "Cheese";
			break;
		default:
			break;
		}
		
		
		
		/*Food_Source source = new Food_Source();
		source.oilname="Olive";
		source.spiceName="Hub";
		*/
		//oilName = "Milk", spiceName = "cheese"; (2)
		
		
		return source;//소스를 만들어서 준다
	}

}
