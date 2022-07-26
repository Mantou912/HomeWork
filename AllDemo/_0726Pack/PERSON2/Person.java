package HomeWork.AllDemo._0726Pack.PERSON2;

public class Person {
    protected String Name;
    protected String Gender;
    protected int Age;

    public Person(String name, String gender, int age) {
        Name = name;
        Gender = gender;
        Age = age;
    }

    public void Show() {
        System.out.println("Person{" + "Name='" + Name + '\'' + ", Gender='" + Gender + '\'' + ", Age=" + Age + '}');
    }
}
