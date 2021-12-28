package baitap;

public class Dog extends Animal implements AnimalMethor{
    public Dog() {
    }

    public Dog(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public int run() {
        return 60;
    }

    @Override
    public String makeSound() {
        return "gâu gâu";
    }
    public void lookMyHouse() {
        System.out.println("chó biết trông nhà");
    }
    public void  display() {
        System.out.printf("%-20s", "Dog");
        System.out.printf("%-20S", super.getName());
        System.out.printf("%-20s", super.getAge());
        System.out.printf("%s", super.getWeight());
        System.out.println();
    }
}
