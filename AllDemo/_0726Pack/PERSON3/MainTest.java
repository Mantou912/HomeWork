package HomeWork.AllDemo._0726Pack.PERSON3;


public class MainTest {
    public static void main(String[] args) {
        Person person1 = new Person("��ɮ", 210, "��������", "����");
        Person person2 = new Person("�����", 250, "��������", "����");
        Person person3 = new Person("�׹Ǿ�", 200, "����צ", "����");
        person1.skill();
        person2.skill();
        person3.skill();
        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(person3));
    }
}
