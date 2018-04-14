package com.artyom.khvediouk.Model;

public class Cat extends Mamal {
    private Owner owner;
    private int numberOfLives;

    public Cat(String name, int age, Color color, String specialAbility, Owner owner, int numberOfLives) {
        super(name, age, color, specialAbility);
        this.owner = owner;
        this.numberOfLives = numberOfLives;

    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }


    @Override
    public String toString() {
        return "I am cat ,my name is: " + super.getName() + " my age is " + super.getAge() + "\n"
                + "my color is :" + super.getColor() + " my special ability is " + super.getSpecialAbility() + "\n" +
                owner + " number of lives: " + getNumberOfLives();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (o instanceof Cat) {
            Cat other = (Cat) o;
            if (super.equals(other) && this.getNumberOfLives() == other.getNumberOfLives()) {
                return true;
            }
        }
        return false;
    }

    public int getNumberOfLives() {
        return numberOfLives;
    }

    public void setNumberOfLives(int numberOfLives) {
        this.numberOfLives = numberOfLives;
    }

    @Override
    public Object clone() {
        return super.clone();
    }
}