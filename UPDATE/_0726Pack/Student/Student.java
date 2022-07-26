package HomeWork.UPDATE._0726Pack.Student;

import java.util.Objects;

public class Student {
    private int sid;
    private String name;

    public Student() {
    }

    public Student(int sid, String name) {
        this.sid = sid;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sid == student.sid && Objects.equals(name, student.name);
    }

}