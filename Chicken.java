package com.artyom.khvediouk.Model;

public class Chicken extends Bird {

    private int eggs;

    public Chicken(String name, int age, Color color, int eggs) {
        super(name, age, color, 0);
        this.eggs = eggs;
    }

    @Override
    public void eat() {
        System.out.println("I am chicken , I am eating worms");
    }

    @Override
    public void sleep() {
        System.out.println(" I am chicken , I am sleeping");
    }

    @Override
    public void fly() {
        System.out.println("I am chicken , sadly I cannot fly");
    }

    @Override
    public String toString() {
        return "I am a chicken , my name is : " + super.getName() + " my age is : " + super.getAge() + "\n" +
                "my color is : " + super.getColor() + " I layed " + eggs + " eggs";
    }

    public int getEggs() {
        return eggs;
    }

    public void setEggs(int eggs) {
        this.eggs = eggs;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (o instanceof Chicken) {
            Chicken other = (Chicken) o;
            if (super.equals(other) && this.getEggs() == other.getEggs()) {
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
