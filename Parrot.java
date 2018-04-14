package com.artyom.khvediouk.Model;

public class Parrot extends Bird {
    private Color wingsColor;

    public Parrot(String name, int age, Color color, int wingSpan, Color wingsColor) {
        super(name, age, color, wingSpan);
        this.wingsColor = wingsColor;
    }

    public Color getWingsColor() {
        return wingsColor;
    }

    public void setWingsColor(Color wingsColor) {
        this.wingsColor = wingsColor;
    }

    @Override
    public void eat() {
        System.out.println("I am parrot, I am eating corn");
    }

    @Override
    public void sleep() {
        System.out.println(" I am parrot , I am sleeping");
    }

    @Override
    public void fly() {
        System.out.println("I am parrot, I am flying out of my cage");
    }

    @Override
    public String toString() {
        return "I am parrot , my name is " + this.getName() + " my age is " + this.getAge() + ", my color is " + this.getColor() +
                ", my wing span is " + this.getWingSpan() + " meters, my wings color is " + this.getWingsColor();
    }
}
