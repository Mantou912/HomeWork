package HomeWork.AllDemo.StuAndDocPack;

public class Student {
    String name;
    String Class;
    int age;
    String hobby;

    public Student() {
        age = 21;
        name = "Tom";
        Class = "S1班";
        hobby = "篮球";
    }

    public String say() {
        String sum = "";
        sum = "姓名: " + name + "\t就读于: " + Class + "\t年龄: " + age + "\tID: " + "\t爱好： " + hobby;
        return sum;
    }
}
