package edu.grcy.patterns.creational.abstractFactory;

public class FordOrdering {

	public static Ford getFord(FordAbstractFactory factory){
		return factory.createFord();
	}
}
