package HomeWork.AllDemo.HUSBANDPack;

public class Husband {
    String name;
    int age;
    Wife wife;

    public Husband() {
        name = "Tom";
        age = 34;
    }

    public Husband(Husband husband) {
        this.name = husband.name;
        this.age = husband.age;
    }

    public void getInfo() {

        System.out.println("Name��" + this.name);
        System.out.println("Age��" + this.age);
        System.out.println("NameOfWife��" + wife.name);
        System.out.println("AgeOfWife��" + wife.age);
        System.out.println();
    }
}
