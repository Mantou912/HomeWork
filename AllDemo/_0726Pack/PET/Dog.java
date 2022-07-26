package HomeWork.AllDemo._0726Pack.PET;

public class Dog extends Pet {
    String Strain;

    public Dog() {
        System.out.println("DOG CONSTRUCTOR!");
    }

    @Override
    public void show() {

    }

    public Dog(String strain) {
        Strain = strain;
        System.out.println("DOG CONSTRUCTOR WITH PARAMETER!");
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName() + " Health: " + getHealth() + " Love: " + getLove() + " Strain: " + getStrain());

    }

    public String getStrain() {
        return Strain;
    }

}
