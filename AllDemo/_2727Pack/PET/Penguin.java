package HomeWork.AllDemo._2727Pack.PET;

public class Penguin extends Pet {
    String Sex;

    @Override
    public void show() {

    }

    public void print() {
        System.out.println("Name: " + getName() + " Health: " + getHealth() + " Love: " + getLove() + " Sex: " + getSex());

    }

    @Override
    public void Hospital() {
        setHealth(getHealth() + 10);
        System.out.println("∆Û∂Ïø¥≤°");
    }

    public String getSex() {
        return Sex;
    }

    public void swimming() {
        System.out.println("—ÕÀ¿¡À");
    }
}
