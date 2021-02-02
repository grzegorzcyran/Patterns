package edu.grcy.patterns.creational.builder;

public class HouseBuilderDemo {
    public static void main(String[] args) {

        House smallHouse = new House.HouseBuilder("bloczki", "Ytong", "papodachówka").build();

        House houseWithGarage = new House.HouseBuilder("ława", "Max", "Dachówka")
                .withGarage("Wiata").build();

        House residence = new House.HouseBuilder("Bloczki + ława", "Cegła XIXw", "Dachówka")
                .withGarage("Wolnostojący, 3stanowiskowy")
                .withGarden("Ogród z jeziorem")
                .build();

        House residence2 = new House.HouseBuilder("Bloczki", "Cegła XXw", "Dachówka")
                .withGarden("Ogród ")
                .withGarage("Wolnostojący, 2stanowiskowy")
                .build();


        /**
         * StringBuffer jest od początku, StringBuilder doszedł później
         * Buffer jest bezpieczny w aplikacji wielowątkowej, ale przez to wolniejszy
         *
         * Builder jest do aplikacji 1-wątkowych, ale dzięki temu szybszy
         */
        StringBuffer buffer;

        String builder = new StringBuilder("aaa")
                .append("bbb")
                .toString();

    }
}
