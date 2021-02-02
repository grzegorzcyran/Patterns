package edu.grcy.patterns.creational.singleton;

public class LazySingleton {
	//lazy singleton nie jest od razu inicjowany, dopiero przy wywołaniu getInstance
	private static LazySingleton instance;

	private LazySingleton(){
		System.out.println("Lazy Singleton initialization");
	}

	public static LazySingleton getInstance(){
		//2. Wątek numer 2 wchodzi i dla niego instance nadal jest null więc też wchodzi do if'a
		if (instance == null){
			//1. wątek numer 1 dochodzi tu i zostaje zatrzymany na rzecz wątku numer 2
			//3. wątek nr 2 wchodzi i czeka lub robi newLazy...
			//4. wątek nr 1 robi newLazy...
			instance = new LazySingleton();

			//rozwiązanie to albo synchronized albo
			//singleton z podwójnym sprawdzaniem
		}
		return instance;
	}

}
