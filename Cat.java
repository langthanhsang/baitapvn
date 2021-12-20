package baitap;

public class Cat extends Animal implements AnimalMethor{
    private String hunt;

    public Cat(String hunt) {
        this.hunt = hunt;
    }

    public Cat(String name, int age, double weight, String hunt) {
        super(name, age, weight);
        this.hunt = hunt;
    }

    public String getHunt() {
        return hunt;
    }

    public void setHunt(String hunt) {
        this.hunt = hunt;
    }

    @Override
    public int run() {
        return 0;
    }

    @Override
    public String makeSound() {
        return null;
    }
    public String hunt() {
       return hunt();
    }

    @Override
    public String toString() {
        return "Cat{" + super.toString()+
                "hunt='" + hunt + '\'' +
                '}';
    }
}
