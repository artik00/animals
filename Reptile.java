package com.artyom.khvediouk.Model;

public class Reptile extends Animal {

    private int numberOfLegs;

    public Reptile(String name, int age, Color color, int numberOfLegs) {
        super(name, age, color);
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public void eat() {
        System.out.println(" I am reptile , I am eating");
    }

    @Override
    public void sleep() {
        System.out.println("I am reptile , I am going to sleep");
    }

    @Override
    public String toString() {
        return "I am a reptile , my name is : " + super.getName() + " my age is : " + super.getAge() + "\n" +
                "my color is : " + super.getColor() + " number of legs is: " + getNumberOfLegs();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (o instanceof Reptile) {
            Reptile other = (Reptile) o;
            if (super.equals(other) && this.getNumberOfLegs() == other.getNumberOfLegs()) {
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
