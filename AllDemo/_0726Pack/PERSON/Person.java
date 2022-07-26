package HomeWork.AllDemo._0726Pack.PERSON;

public class Person {
    String Name;
    String Address;
    String telPhone;
    String eMail;

    public static void main(String[] args) {
        Person p1 = new Faculty();
        Person p2 = new Staff();

        Faculty faculty = (Faculty) p1;
        faculty.Degree = "本科";

        Staff staff = (Staff) p2;
        staff.Duty = "职员";
    }
}
