package com.artyom.khvediouk.Model;

public class Snake extends Reptile{

    private int length;

    public Snake(String name, int age, Color color, int length) {
        super(name, age, color, 0);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }


    @Override
    public void eat() {
        System.out.println(" I am snake , I eat rats");
    }

    @Override
    public void sleep() {
        System.out.println(" I am snake  , I never sleep");
    }

    @Override
    public String toString() {
        return "I am a snake , my name is : " + super.getName() + " my age is : " + super.getAge() + "\n" +
                "my color is : " + super.getColor() + " my length is " + length + " meters";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (o instanceof Snake) {
            Snake other = (Snake) o;
            if (super.equals(other) && this.getLength() == other.getLength()) {
                return true;
            }
        }
        return false;
    }
}
