package HomeWork.UPDATE._0726Pack;

public class Dog extends Pet {
    String Strain;

    @Override
    public void print() {
        System.out.println("Name: " + Name + " Health: " + Health + " Love: " + Love + " Strain: " + Strain);

    }

    public String getStrain() {
        return Strain;
    }
}
