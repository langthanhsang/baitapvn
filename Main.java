package baitap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AnimalManager animalManager = new AnimalManager();
        int choice;
        do {
            System.out.println("**********menu***********");
            System.out.println("1. add a Animal");
            System.out.println("2. delete a animal by name");
            System.out.println("3. update a animal by name");
            System.out.println("4. display all information a animal");
            System.out.println("5. display all animal");
            System.out.println("6. ndisplay all dog in annimal");
            System.out.println("7. display all animal width");
            System.out.println("enter your choice");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("add a animal ");
                    animalManager.createAnimal(scanner, animalManager);
                    break;

                case 2:
                    System.out.println("delete a animal by name");
                    String nameDelete = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println(animalManager.deleteAnimal(nameDelete));
                    break;
                case 3:
                    System.out.println("update a animal by name");
                case 4:
                    System.out.println("display all information a animal");
                case 5:
                    System.out.println("display all animal");
                    animalManager.displayAll();
                    break;
                case 6:
                    System.out.println("display all dog in annimal");
                case 7:

                    System.out.println("display all animal width");
            }

        }while (choice !=0);

    }

}
