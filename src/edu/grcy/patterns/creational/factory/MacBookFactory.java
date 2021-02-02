package edu.grcy.patterns.creational.factory;

public class MacBookFactory {

	public static MacBook getMacBook(String type, String name, String value1, int value2){
		if("Air".equalsIgnoreCase(type))
			return new MacBookAir(name, value1, value2);
		else if("Pro".equalsIgnoreCase(type))
			return new MacBookPro(name, value1, value2);
		//jeśli chcemy dołożyć kolejny typ to łamiemy OCP
		return null;
	}
}

