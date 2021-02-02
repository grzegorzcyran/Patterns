package edu.grcy.patterns.creational.abstractFactory;

public class FordFactoryCreatingDemo {
    public static void main(String[] args) {

        //chcemy Fiestę
        Ford fiesta1 = FordOrdering.getFord(new FordFiestaFactory("Fiesta Black", "1,2EcoBoost", "Winter Pack"));
        Ford fiesta2 = FordOrdering.getFord(new FordFiestaFactory("Fiesta Pink", "1,6EcoBoost", "Family Pack, Winter Pack, Titanium"));

        //chcemy Focusa
        Ford focus1 = FordOrdering.getFord(new FordFocusFactory("Focus Blue", "1,6EcoBoost", "Trend, Winter Pack"));

        /**
         * Porównanie z factoryMethod
         * 1. Bardziej skomplikowany kod
         * 2. Więcej klas i obiektów
         * 3. Dodanie kolejnego typu (np. Kuga) nie łamie OCP
         * 4. Rozszerzanie asortymentu nie ma wpływu na dotychczasowe klasy, powoduje powstanie nowych
         *    które są podobne
         */

        /**
         * Jak robimy fabrykę i :
         * - wiemy że liczba typów obiektów nam nie wzrośnie - możemy zrobić FactoryMethod
         * - wiemy / podejrzewamy / nie wiemy czy liczba typów się zmieni -> Abstract Factory
         */
    }
}
