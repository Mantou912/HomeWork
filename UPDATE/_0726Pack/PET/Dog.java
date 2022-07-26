package HomeWork.UPDATE._0726Pack.PET;

public class Dog extends Pet {
    String Strain;

    public Dog() {
        System.out.println("DOG CONSTRUCTOR!");
    }

    public Dog(String strain) {
        Strain = strain;
        System.out.println("DOG CONSTRUCTOR WITH PARAMETER!");
    }

    @Override
    public void print() {
        System.out.println("Name: " + Name + " Health: " + Health + " Love: " + Love + " Strain: " + Strain);

    }

    public String getStrain() {
        return Strain;
    }

}
