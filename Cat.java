package baitap;

public class Cat extends Animal implements AnimalMethor {
    public Cat() {
    }

    public Cat(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public int run() {
        return 40;
    }

    @Override
    public String makeSound() {
        return "meo meo";
    }

    public void catchMouse() {
        System.out.println("mèo biết bắt chuột");
    }

    public void display() {
        System.out.printf("%-20s", "Cat");
        System.out.printf("%-20S", super.getName());
        System.out.printf("%-20s", super.getAge());
        System.out.printf("%s", super.getWeight());
        System.out.println();
    }
}
