package HomeWork.AllDemo.HUSBANDPack;

public class Wife {
    String name;
    int age;
    Husband husband;

    public Wife() {
        name = "Marry";
        age = 36;
    }

    public Wife(Wife wife) {
        this.name = wife.name;
        this.age = wife.age;
    }

    public void getInfo() {
        System.out.println("Name��" + this.name);
        System.out.println("Age��" + this.age);
        System.out.println("NameOfHusband��" + husband.name);
        System.out.println("AgeOfHusband��" + husband.age);
    }

}
