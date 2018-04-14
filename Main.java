package com.artyom.khvediouk;

import com.artyom.khvediouk.Model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Animal> listOfAnimals = createAnimals();

        printAnimals(listOfAnimals);

    }

    private static void printAnimals(List<Animal> listOfAnimals) {
        for (Animal animal: listOfAnimals) {
            System.out.println(animal);
            animal.eat();
            animal.sleep();
            if(animal instanceof Bird) {
                Bird bird = (Bird) animal;
                bird.fly();
            }
}
    }

    private static List<Animal> createAnimals() {
        List<Animal> listOfAnimals = new ArrayList<>();
        Animal dog = new Dog("Lola", 10 , Color.GOLD,
"sleeping" , new Owner("Art", "0546396450"));

        Animal snake = new Snake("Cobra" , 3 , Color.BLACK, 3);

        Animal chicken = new Chicken("chick" , 3, Color.BROWN, 4);

        Animal cat1 = new Cat("Tom" , 3, Color.BLACK, "chasing mice", new Owner("GrandMa", "1234"), 9);

        Animal parrot = new Parrot("Kakadu", 2, Color.BLACK, 4, Color.BLUE);

        Animal dog1 = new Dog("Lola", 3, Color.BLACK , "sleeping", new Owner("Art" , "054"));
        Dog dog2 = (Dog) dog1.clone();
        dog2.setOwner(new Owner("Anat", "054444"));

        listOfAnimals.add(dog);
        listOfAnimals.add(snake);
        listOfAnimals.add(chicken);
        listOfAnimals.add(cat1);
        listOfAnimals.add(dog1);
        listOfAnimals.add(dog2);
        listOfAnimals.add(parrot);
        return listOfAnimals;
    }
}
