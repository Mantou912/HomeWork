package HomeWork.UPDATE._2727Pack.Game;

public class MainTest {
    public static void main(String[] args) {
        Team team = new Team();

        Role magician1 = new Magician("�ʵ���", 100);
        Role soldier1 = new Soldier("�����˹", 500);
        Role magician2 = new Magician("����˹", 1);
        Role soldier2 = new Soldier("����ŵ˹", 450);
        Role magician3 = new Magician("��ī߯��", 200);
        Role soldier3 = new Soldier("��������˹", 700);

        team.addMember(magician1);
        team.addMember(soldier1);
        team.addMember(magician2);
        team.addMember(soldier2);
        team.addMember(magician3);
        team.addMember(soldier3);

        System.out.println("���˺��� " + team.attackSum());
    }
}
