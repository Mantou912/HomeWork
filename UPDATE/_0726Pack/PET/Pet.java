package HomeWork.UPDATE._0726Pack.PET;

public class Pet {
    String Name;
    int Health;
    int Love;

    public Pet() {
        System.out.println("PET CONSTRUCTOR!");
    }

    public Pet(String name, int health, int love) {
        Name = name;
        Health = health;
        Love = love;
        System.out.println("PET CONSTRUCTOR WITH PARAMETER!");
    }

    public void print() {
        System.out.println("Name: " + Name + " Health: " + Health + " Love: " + Love);
    }

    public String getName() {
        return Name;
    }

    public int getHealth() {
        return Health;
    }

    public int getLove() {
        return Love;
    }
}
