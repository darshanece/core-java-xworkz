class Swigy{

public static double search(String foodName){
	if("ice cake"==foodName){
		System.out.println("i searched one  food :"+foodName);
		return 50.00;
	}
	if("chocklate cake"==foodName){
		System.out.println("i searched another  food :"+foodName);
		return 55.00;
	}
	if("honey cake"==foodName){
		System.out.println("i searched another  food :"+foodName);
		return 90.00;
	}
	if("apple cake"==foodName){
		System.out.println("i searched another  food :"+foodName);
		return 40.0;
	}
	if("cold cake"==foodName){
		System.out.println("i searched anothere  food :"+foodName);
		return 80.0;
	}
	if("normal cake"==foodName){
		System.out.println("i searched anothere  food :"+foodName);
		return 100.0;
	}
	if("pineapple cake"==foodName){
		System.out.println("i searched another  food :"+foodName);
		return 56.00;
	}
	if("egg rool"==foodName){
		System.out.println("i searched another food is:"+foodName);
		return 1221;
	}
	if("veg rool"==foodName){
		System.out.println("i searched another food is:"+foodName);
		return 120.;
	}
	if("panner rool"==foodName){
		System.out.println("i searched another food is:"+foodName);
		return 150.0;
	}
	if("chicken with egg rool"==foodName){
		System.out.println("i searched another food is:"+foodName);
		return 120.0;
	}
	if("double chicken rool"==foodName){
		System.out.println("i searched another food is:"+foodName);
		return 45.0;
	}
	if("mushroom rool"==foodName){
		System.out.println("i searched another food is:"+foodName);
		return 85.0;
	}
	if("vegetable rool"==foodName){
		System.out.println("i searched another food is:"+foodName);
		return 95.0; 
	}
	if("chicken 65 rool"==foodName){
		System.out.println("i searched another food is:"+foodName);
		 return 88.0; 
	}
	if("pav bajji"==foodName){
		System.out.println("i searched another food is:"+foodName);
		return 788.0;
	}
	if("bonda"==foodName){
		System.out.println("i searched another food is:"+foodName);
		return 455.0;
	}
	if("panner butter masala"==foodName){
		System.out.println("i searched another food is:"+foodName);
		return 45.0;
	}
	if("gobi"==foodName){
		System.out.println("i searched another food is:"+foodName);
		return 150.0;
    }
	if("masala puri"==foodName){
		System.out.println("i searched another food is:"+foodName);
		return 75.0;
	}
	return 0.0;
}


public static double search(String foodName, int quantity){
	if("ice cake"==foodName){
		
		return 50.00*quantity;
	}
	if("chocklate cake"==foodName){
		
		return 55.00*quantity;
	}
	if("honey cake"==foodName){
		
		return 90.00*quantity;
	}
	if("apple cake"==foodName){
		
		return 40.0*quantity;
	}
	if("cold cake"==foodName){
		
		return 80.0*quantity;
	}
	if("normal cake"==foodName){
		
		return 100.0*quantity;
	}
	if("pineapple cake"==foodName){
		
		return 56.00*quantity;
	}
	if("egg rool"==foodName){
		
		return 1221*quantity;
	}
	if("veg rool"==foodName){
		
		return 120.0*quantity;
	}
	if("panner rool"==foodName){
		
		return 150.0*quantity;
	}
	if("chicken with egg rool"==foodName){
		
		return 120.0*quantity;
	}
	if("double chicken rool"==foodName){
		
		return 45.0*quantity;
	}
	if("mushroom rool"==foodName){
		
		return 85.0*quantity;
	}
	if("vegetable rool"==foodName){
		
		return 95.0*quantity; 
	}
	if("chicken 65 rool"==foodName){
		
		 return 88.0*quantity; 
	}
	if("pav bajji"==foodName){
		
		return 788.0;
	}
	if("bonda"==foodName){
		
		return 455.0*quantity;
	}
	if("panner butter masala"==foodName){
		
		return 45.0*quantity;
	}
	if("gobi"==foodName){
		
		return 150.0*quantity;
    }
	if("masala puri"==foodName){
		
		return 75.0*quantity;
	}
	return 0.0*quantity;
}
}