package edu.grcy.patterns.creational.singleton;

//Bill Bugh wymyślił singleton na klasie wewnętrznej prywatnej
//w czasach przed Javą6
public class BillPughSingleton {

	private BillPughSingleton() {
		System.out.println("Object initialisation");
	}

	private static class SingletonHelper {

		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}

	public static BillPughSingleton getInstance() {
		System.out.println("Get instance");
		return SingletonHelper.INSTANCE;
	}
}
