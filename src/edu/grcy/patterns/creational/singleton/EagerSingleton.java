package edu.grcy.patterns.creational.singleton;

public class EagerSingleton {
	//obiekt klasy EagerSingleton - tworzony od razu przy wczytaniu klasy
	private static final EagerSingleton instance = new EagerSingleton();

	//konstruktor prywatny
	private EagerSingleton(){
		System.out.println("Eager singleton initialisation");
	}

	//dostępna z zewnątrz klasa zwracająca obiekt
	public static EagerSingleton getInstance(){
		System.out.println("Get instance");
		return instance;
	}

}
