package baitap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AnimalManager {
    //    Set<Animal> animalSet = new HashSet<>();
    private ArrayList<Animal> animals;
    private final Scanner scanner = new Scanner(System.in);

    public AnimalManager() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public Animal deleteAnimal(String name) {
        Animal animal = null;
        for (Animal a : animals) {
            if (a.getName() == name) {
                animal = a;
            }
        }
        animals.remove(animal);
        return animal;
    }
    public void displayAll() {
        for (Animal animal: animals) {
            System.out.println(animal);
        }
    }

    public void createAnimal(Scanner scanner, AnimalManager animalManager) {
        System.out.println();
        System.out.println("nhập tên : ");
        String name = scanner.nextLine();
        scanner.nextLine();
        System.out.println("nhập tuổi : ");
        int age = scanner.nextInt();
        System.out.println("nhập cân nặng ");
        double weight = scanner.nextDouble();
       Animal animal = new Animal(name,age,weight);
       animalManager.addAnimal(animal);
    }
}
