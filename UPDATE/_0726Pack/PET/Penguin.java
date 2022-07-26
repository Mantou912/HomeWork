package HomeWork.UPDATE._0726Pack.PET;

public class Penguin extends Pet {
    String Sex;

    @Override
    public void show() {

    }

    public void print() {
        System.out.println("Name: " + getName() + " Health: " + getHealth() + " Love: " + getLove() + " Sex: " + getSex());

    }

    public String getSex() {
        return Sex;
    }
}
