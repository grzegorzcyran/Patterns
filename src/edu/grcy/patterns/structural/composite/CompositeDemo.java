package edu.grcy.patterns.structural.composite;

public class CompositeDemo {
    public static void main(String[] args) {

        Shape triangle1 = new Triangle();
        Shape triangle2 = new Triangle();
        Shape circle1 = new Circle();

        Shape drawing1 = new Drawing();
        Shape drawing2 = new Drawing();

        ((Drawing) drawing1).add(triangle2);
        ((Drawing) drawing1).add(circle1);


        ((Drawing) drawing2).add(triangle1);
        ((Drawing) drawing2).add(drawing1);

        System.out.println("===============");
        drawing1.draw("Niebieski");
        System.out.println("=====================");
        System.out.println("=====================");
        System.out.println("=====================");
        drawing2.draw("Zielony");


    }
}
