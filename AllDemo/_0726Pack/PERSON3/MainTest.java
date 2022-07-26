package HomeWork.AllDemo._0726Pack.PERSON3;


public class MainTest {
    public static void main(String[] args) {
        Person person1 = new Person("ÌÆÉ®", 210, "½õïçôÂôÄ", "ÈË×å");
        Person person2 = new Person("ËïÎò¿Õ", 250, "¶¨º£ÉñÕë", "ÏÉ×å");
        Person person3 = new Person("°×¹Ç¾«", 200, "¾ÅÒõ×¦", "Ñı×å");
        person1.skill();
        person2.skill();
        person3.skill();
        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(person3));
    }
}
