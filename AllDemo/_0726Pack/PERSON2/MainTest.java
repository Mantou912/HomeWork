package HomeWork.AllDemo._0726Pack.PERSON2;

public class MainTest {
    public static void main(String[] args) {
        Student student1 = new Student("������", "Male", 20, "10010");
        Student student2 = new Student("���仨", "Female", 21, "10012");
        student1.Show();
        student2.Show();
        System.out.println(student1.equals(student2));
    }
}
