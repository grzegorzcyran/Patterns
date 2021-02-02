package edu.grcy.patterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class ShoppingList implements Cloneable{
	private List<String> shoppingList;

	public ShoppingList(){
		shoppingList = new ArrayList<>();
		loadData();
	}

	public ShoppingList(List<String> list){
		this.shoppingList=list;
	}

	public void loadData(){
		shoppingList.add("ser żółty");
		shoppingList.add("szyneczka");
		shoppingList.add("pomidory");
		shoppingList.add("chleb");
	}

	public void setShoppingList(List<String> shoppingList) {
		this.shoppingList = shoppingList;
	}

	public List<String> getShoppingList() {
		return shoppingList;
	}

	@Override
	public Object clone() throws CloneNotSupportedException{
		List<String> temp = new ArrayList<>();

		temp.addAll(shoppingList);
		return new ShoppingList(temp);
	}
}

