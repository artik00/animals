package com.artyom.khvediouk.Model;

public class Bird extends Animal {
    private int wingSpan;


    public Bird(String name, int age, Color color, int wingSpan) {
        super(name, age, color);
        this.wingSpan = wingSpan;
    }

    public int getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(int wingSpan) {
        this.wingSpan = wingSpan;
    }

    @Override
    public void eat() {
        System.out.println("I am Bird , eating worms");
    }

    @Override
    public void sleep() {
        System.out.println("I am Bird , I am sleeping on trees.");
    }

    public void fly() {
        System.out.println("Look I am bird and I'm flying");
    }

    @Override
    public String toString() {
        return "I am a bird , my name is : " + super.getName() + " my age is : " + super.getAge() + "\n" +
                "my color is : " + super.getColor() + " my wing span is " + wingSpan + "centimeters";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (o instanceof Bird) {
            if (super.equals(o) && this.getWingSpan() == ((Bird) o).getWingSpan()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Object clone() {
        return super.clone();
    }
}
