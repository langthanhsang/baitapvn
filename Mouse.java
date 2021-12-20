package baitap;

public class Mouse extends Animal implements AnimalMethor{

    private String hide;

    public Mouse(String hide) {
        this.hide = hide;
    }

    public Mouse(String name, int age, double width, String hide) {
        super(name, age, width);
        this.hide = hide;
    }

    public String getHide() {
        return hide;
    }

    public void setHide(String hide) {
        this.hide = hide;
    }

    @Override
    public int run() {
        return 0;
    }

    @Override
    public String makeSound() {
        return null;
    }

    public String hide() {
        return hide();
    }

    @Override
    public String toString() {
        return "Mouse{" + super.toString() +
                "hide='" + hide + '\'' +
                '}';
    }
}
