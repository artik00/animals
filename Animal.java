package com.artyom.khvediouk.Model;

public abstract class Animal implements Cloneable {

    private String name;
    private int age;
    private Color color;

    public Animal(String name, int age, Color color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public abstract void eat();

    public abstract void sleep();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "I am an animal , my name is : " + name + " my age is : " + age + "\n" +
                "my color is : " + color;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (o instanceof Animal) {
            Animal other = (Animal) o;
            if (this.getAge() == other.getAge() && this.getColor().equals(other.getColor()) && this.getName().equals(other.getName())){
                return true;
            }
        }
        return false;

    }
    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException ex) {
            System.out.println("CloneNotSupportedException was thrown by : "+ex.getMessage());
            return null;
        }
    }
}
