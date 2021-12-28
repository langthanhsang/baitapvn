package baitap;

public class Mouse extends Animal implements AnimalMethor {

    public Mouse() {
    }

    public Mouse(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public int run() {
        return 20;
    }

    @Override
    public String makeSound() {
        return "chit chit";
    }

    public void eatRice() {
        System.out.println("chuột ăn gạo");
    }

    public void display() {
        System.out.printf("%-20s", "Mouse");
        System.out.printf("%-20S", super.getName());
        System.out.printf("%-20s", super.getAge());
        System.out.printf("%s", super.getWeight());
        System.out.println();
    }


}
