package baitap;

public class Dog extends Animal implements AnimalMethor{
    private String bite;

    public Dog(String name, int age, double width, String bite) {
        super(name, age, width);
        this.bite = bite;
    }

    public Dog(String bite) {
        this.bite = bite;
    }

    public String getBite() {
        return bite;
    }

    public void setBite(String bite) {
        this.bite = bite;
    }

    @Override
    public int run() {

        return run() + 15;
    }

    @Override
    public String makeSound() {
        return "gâu gâu";
    }

    public String bite() {
        return bite();
    }

    @Override
    public String toString() {
        return "Dog{" + super.toString() +
                "bite='" + bite + '\'' +
                '}';
    }
}
