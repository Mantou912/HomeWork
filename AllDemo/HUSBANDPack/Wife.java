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
        System.out.println("Name£º" + this.name);
        System.out.println("Age£º" + this.age);
        System.out.println("NameOfHusband£º" + husband.name);
        System.out.println("AgeOfHusband£º" + husband.age);
    }

}
