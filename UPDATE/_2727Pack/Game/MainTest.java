package HomeWork.UPDATE._2727Pack.Game;

public class MainTest {
    public static void main(String[] args) {
        Team team = new Team();

        Role magician1 = new Magician("¸ÊµÀ·ò", 100);
        Role soldier1 = new Soldier("çê¶ûĞŞË¹", 500);
        Role magician2 = new Magician("¶òÂåË¹", 1);
        Role soldier2 = new Soldier("¿ËÂåÅµË¹", 450);
        Role magician3 = new Magician("µÂÄ«ß¯¶û", 200);
        Role soldier3 = new Soldier("ÆÕÂŞÃ×ĞŞË¹", 700);

        team.addMember(magician1);
        team.addMember(soldier1);
        team.addMember(magician2);
        team.addMember(soldier2);
        team.addMember(magician3);
        team.addMember(soldier3);

        System.out.println("×ÜÉËº¦£º " + team.attackSum());
    }
}
