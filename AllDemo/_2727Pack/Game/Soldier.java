package HomeWork.AllDemo._2727Pack.Game;

public class Soldier extends Role {
    private int Injury;

    public Soldier(Soldier soldier) {
        this.setInjury(soldier.attack());
        this.setName(soldier.getName());
    }

    public Soldier(String name, int injury) {
        this.setInjury(injury);
        this.setName(name);
    }

    public void setInjury(int injury) {
        Injury = injury;
    }

    @Override
    public int attack() {
        return Injury;
    }
}
