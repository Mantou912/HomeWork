package HomeWork.AllDemo.StuAndDocPack;

public class Student {
    String name;
    String Class;
    int age;
    String hobby;

    public Student() {
        age = 21;
        name = "Tom";
        Class = "S1��";
        hobby = "����";
    }

    public String say() {
        String sum = "";
        sum = "����: " + name + "\t�Ͷ���: " + Class + "\t����: " + age + "\tID: " + "\t���ã� " + hobby;
        return sum;
    }
}
