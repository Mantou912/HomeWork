package HomeWork.AllDemo._0727Pack.Game;

public abstract class Role {
    private String Name;

    public Role() {
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public abstract int attack();
}
