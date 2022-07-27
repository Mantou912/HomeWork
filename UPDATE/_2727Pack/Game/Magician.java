package HomeWork.UPDATE._2727Pack.Game;

public class Magician extends Role {
    private int Level;

    public Magician(Magician magician) {
        this.setLevel(magician.getLevel());
        this.setName(magician.getName());
    }

    public Magician(String name, int level) {
        this.setLevel(level);
        this.setName(name);
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int level) {
        Level = level;
    }

    @Override
    public int attack() {
        return Level * 5;
    }
}
