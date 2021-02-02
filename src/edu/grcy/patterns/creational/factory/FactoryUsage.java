package edu.grcy.patterns.creational.factory;

public class FactoryUsage {
    public static void main(String[] args) {
        String memory = "32G";
        String disk = "128G";
        int screenSize = 13;

        /**
         * Fabryka polega na tym że mamy klasy z tej samej rodziny i generujemy je odwołując się do
         * jednej metody (metody fabrycznej)
         *
         * Jak widać konieczne jest tu uwspólnienie listy parametrów
         */

        MacBook newShinyMacbook = MacBookFactory.getMacBook("Air", memory, disk, screenSize);

        MacBook anotherOne = MacBookFactory.getMacBook("Pro", "64G", "521H", screenSize);
    }
}
