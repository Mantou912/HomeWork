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

        System.out.println("Name£º" + this.name);
        System.out.println("Age£º" + this.age);
        System.out.println("NameOfWife£º" + wife.name);
        System.out.println("AgeOfWife£º" + wife.age);
        System.out.println();
    }
}
