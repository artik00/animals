package com.artyom.khvediouk.Model;

public class Mamal extends Animal {


    private String specialAbility;

    public Mamal(String name, int age, Color color, String specialAbility) {
        super(name, age, color);
        this.specialAbility = specialAbility;
    }

    @Override
    public void eat() {
        System.out.println(" I am mamal , I am eating");
    }

    @Override
    public void sleep() {
        System.out.println(" I am mamal , I am going to sleep");
    }

    void walk() {
        System.out.println(" I am mamal , I am walking");
    }

    public String getSpecialAbility() {
        return specialAbility;
    }

    public void setSpecialAbility(String specialAbility) {
        this.specialAbility = specialAbility;
    }

    @Override
    public String toString() {
        return " I am mamal ,my name is: " + super.getName() + " my age is " + super.getAge() + "\n"
                             + "my color is :" + super.getColor() + " my special ability is " + specialAbility;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (o instanceof Mamal) {
            Mamal other = (Mamal) o;
            if (super.equals(other) && this.getSpecialAbility().equals(other.getSpecialAbility())) {
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
