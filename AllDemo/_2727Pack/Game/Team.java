package HomeWork.AllDemo._2727Pack.Game;

public class Team {
    static int Number = 0;
    Role[] role = new Role[6];


    public int attackSum() {
        int AttackSum = 0;
        for (Role role : role) {
            if (role instanceof Magician magician) {
                AttackSum += magician.attack();
            } else if (role instanceof Soldier soldier) {
                AttackSum += soldier.attack();
            }
        }
        return AttackSum;
    }


    public void addMember(Role role) {
        if (Number < 6) {
            if (role instanceof Magician magician) {
                this.role[Number++] = new Magician(magician);
            } else if (role instanceof Soldier soldier) {
                this.role[Number++] = new Soldier(soldier);
            }
        } else {
            System.out.println("³ÉÔ±ÒÑÂú£¡");
        }
    }
}
