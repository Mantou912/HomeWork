package HomeWork.AllDemo._0729Pack.Paradise;

public abstract class Animal {
    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Animal(String name) {
        Name = name;
    }

    public abstract void Shout();
}
