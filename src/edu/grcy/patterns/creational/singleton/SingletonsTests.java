package edu.grcy.patterns.creational.singleton;

public class SingletonsTests {
    public static void main(String[] args) {
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        //EagerSingleton eagerSingleton2 = new EagerSingleton(); konstruktor prywatny więc to nie przechodzi

        LazySingleton lazySingleton = LazySingleton.getInstance();

        /**
         * Zapoznajcie się z Singletonem bazującym na Enumie
         */

        /**
         * Singleton bywa nazywany antywzorcem:
         *  - bo jest kilka sposobów napisania go
         *  - bo jest nadużywany
         *  - jest problematyczny przy wielowątkowości
         *  - jest problematyczny przy refleksach bo umożliwiają one dostęp do metod prywatnych
         */

        /**
         * Mimo wszystko Singleton jest MEGA używany, np przez framework SPRING
         */
    }
}
