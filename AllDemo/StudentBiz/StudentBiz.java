package HomeWork.AllDemo.StudentBiz;

import java.util.Scanner;

public class StudentBiz {
    static int Numbers;
    String[] Names = new String[100];

    Student[] students = new Student[100];

    public StudentBiz() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入学生人数");
        int number = scanner.nextInt();
        System.out.println(Names.length);
        for (int i = 0; i < number; i++) {
            System.out.print("请输入学生姓名：");
            String name = scanner.next();
            addName(name);
            students[Numbers - 1] = new Student();
        }
    }

    public void addName(String name) {
        Names[Numbers] = name;
        Numbers++;
    }

    public void showName() {
        for (int i = 0; i < Numbers; i++) {
            System.out.println(Names[i]);
        }
    }

    public boolean searchName(int start, int end, String name) {
        for (int i = start - 1; i < end; i++) {
            if (name.equals(Names[i])) {
                return true;
            }
        }
        return false;
    }
}
