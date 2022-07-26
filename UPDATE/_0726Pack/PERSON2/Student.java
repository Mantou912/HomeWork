package HomeWork.UPDATE._0726Pack.PERSON2;

public class Student extends Person {
    String ID;

    public Student(String name, String gender, int age, String ID) {
        super(name, gender, age);
        this.ID = ID;
    }

    @Override
    public void Show() {
        System.out.println("Student{" + "Name='" + Name + '\'' + ", Gender='" + Gender + '\'' + ", Age=" + Age + ", ID=" + ID + '}');
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return ID != null ? ID.equals(student.ID) : student.ID == null && Name.equals(((Student) o).Name);
    }

}
