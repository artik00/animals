package com.artyom.khvediouk.Model;

public class Dog extends Mamal {

    private Owner owner;

    public Dog(String name, int age, Color color, String specialAbility, Owner owner) {
        super(name, age, color, specialAbility);
        this.owner = owner;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public void eat() {
        System.out.println(" I am dog , I am eating snacks");
    }

    @Override
    public void sleep() {
        System.out.println("I am dog , I am going to sleep , woof woof");
    }

    @Override
    public String toString() {
        return " I am dog ,my name is: " + super.getName() + " my age is " + super.getAge() + "\n"
                + "my color is :" + super.getColor() + " my special ability is " + super.getSpecialAbility() + "\n" +
                  owner ;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (o instanceof Dog) {
            Dog other = (Dog) o;
            if (super.equals(other) && getOwner().equals(other.getOwner())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Object clone() {
        return (Dog) super.clone();
    }
}
